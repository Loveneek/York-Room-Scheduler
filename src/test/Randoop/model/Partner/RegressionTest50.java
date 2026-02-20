import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest50 {

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
    public void test25001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25001");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.setVerified(true);
        boolean boolean13 = partner3.isVerified();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test25002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25002");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "hi!");
        partner3.logout();
        partner3.login("", "hi!");
        partner3.logout();
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test25003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25003");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.logout();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str14 = partner3.getID();
        java.lang.String str15 = partner3.getEmail();
        double double16 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
    }

    @Test
    public void test25004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25004");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getID();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        partner3.login("partner", "hi!");
        partner3.viewProfile();
        partner3.logout();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test25005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25005");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.login("hi!", "");
        java.lang.String str10 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test25006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25006");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        partner3.login("", "partner");
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getEmail();
        double double17 = partner3.getHourlyRate();
        partner3.logout();
        boolean boolean19 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test25007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25007");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        partner3.login("hi!", "hi!");
        java.lang.String str11 = partner3.getEmail();
        partner3.login("partner", "hi!");
        java.lang.String str15 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str17 = partner3.getID();
        double double18 = partner3.getHourlyRate();
        double double19 = partner3.getHourlyRate();
        java.lang.String str20 = partner3.getAccountType();
        java.lang.String str21 = partner3.getAccountType();
        java.lang.String str22 = partner3.getPassword();
        java.lang.String str23 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test25008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25008");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(true);
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getID();
        partner3.login("hi!", "partner");
        java.lang.String str20 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test25009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25009");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        double double9 = partner3.getHourlyRate();
        java.lang.String str10 = partner3.getPassword();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
    }

    @Test
    public void test25010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25010");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getPassword();
        partner3.viewProfile();
        partner3.logout();
        double double12 = partner3.getHourlyRate();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test25011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25011");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.login("partner", "hi!");
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getAccountType();
        partner3.setVerified(true);
        partner3.login("partner", "hi!");
        partner3.viewProfile();
        boolean boolean20 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test25012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25012");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.logout();
        partner3.logout();
        partner3.logout();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str13 = partner3.getAccountType();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test25013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25013");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getID();
        partner3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25014");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(true);
        java.lang.String str11 = partner3.getEmail();
        partner3.login("hi!", "hi!");
        java.lang.String str15 = partner3.getPassword();
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test25015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25015");
        model.Partner partner3 = new model.Partner("partner", "", "partner");
        partner3.setVerified(false);
        partner3.login("hi!", "hi!");
        boolean boolean9 = partner3.isVerified();
        partner3.setVerified(true);
        partner3.login("", "");
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getID();
        java.lang.String str17 = partner3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test25016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25016");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        partner3.setVerified(true);
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test25017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25017");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        partner3.viewProfile();
        double double13 = partner3.getHourlyRate();
        partner3.login("", "");
        partner3.viewProfile();
        partner3.setVerified(true);
        partner3.logout();
        java.lang.String str21 = partner3.getAccountType();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
    }

    @Test
    public void test25018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25018");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(true);
        partner3.logout();
        java.lang.String str14 = partner3.getID();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getID();
        java.lang.String str17 = partner3.getAccountType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test25019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25019");
        model.Partner partner3 = new model.Partner("", "hi!", "partner");
        partner3.logout();
        java.lang.String str5 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
    }

    @Test
    public void test25020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25020");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str12 = partner3.getAccountType();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str18 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test25021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25021");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        partner3.logout();
        partner3.login("", "");
        java.lang.String str15 = partner3.getEmail();
        boolean boolean16 = partner3.isVerified();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test25022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25022");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getPassword();
        partner3.login("", "hi!");
        partner3.logout();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test25023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25023");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getPassword();
        java.lang.String str11 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.login("hi!", "hi!");
        java.lang.String str17 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test25024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25024");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getAccountType();
        double double14 = partner3.getHourlyRate();
        partner3.viewProfile();
        partner3.login("", "hi!");
        java.lang.String str19 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
    }

    @Test
    public void test25025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25025");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str15 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
    }

    @Test
    public void test25026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25026");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        partner3.logout();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test25027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25027");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getAccountType();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test25028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25028");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        partner3.logout();
        partner3.login("partner", "hi!");
        java.lang.String str15 = partner3.getPassword();
        partner3.login("partner", "");
        java.lang.String str19 = partner3.getID();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test25029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25029");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        partner3.setVerified(true);
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getAccountType();
        partner3.viewProfile();
        double double12 = partner3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test25030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25030");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getAccountType();
        boolean boolean14 = partner3.isVerified();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25031");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.logout();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getID();
        partner3.logout();
        java.lang.String str17 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test25032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25032");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getID();
        partner3.logout();
        partner3.login("partner", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test25033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25033");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        double double7 = partner3.getHourlyRate();
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test25034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25034");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getAccountType();
        boolean boolean13 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test25035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25035");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getAccountType();
        partner3.viewProfile();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25036");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        partner3.logout();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str16 = partner3.getEmail();
        java.lang.String str17 = partner3.getEmail();
        java.lang.String str18 = partner3.getAccountType();
        boolean boolean19 = partner3.isVerified();
        double double20 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
    }

    @Test
    public void test25037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25037");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(true);
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getID();
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test25038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25038");
        model.Partner partner3 = new model.Partner("", "hi!", "hi!");
        partner3.login("partner", "partner");
        java.lang.String str7 = partner3.getID();
        partner3.logout();
        java.lang.String str9 = partner3.getAccountType();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test25039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25039");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getEmail();
        partner3.logout();
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25040");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        boolean boolean12 = partner3.isVerified();
        partner3.setVerified(false);
        partner3.login("hi!", "partner");
        boolean boolean18 = partner3.isVerified();
        double double19 = partner3.getHourlyRate();
        java.lang.String str20 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str22 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "partner" + "'", str22, "partner");
    }

    @Test
    public void test25041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25041");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getPassword();
        partner3.logout();
        partner3.setVerified(false);
        boolean boolean16 = partner3.isVerified();
        java.lang.String str17 = partner3.getID();
        partner3.login("hi!", "");
        partner3.setVerified(true);
        partner3.setVerified(true);
        java.lang.String str25 = partner3.getAccountType();
        partner3.setVerified(true);
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "partner" + "'", str25, "partner");
    }

    @Test
    public void test25042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25042");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getPassword();
        double double13 = partner3.getHourlyRate();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test25043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25043");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        partner3.login("hi!", "hi!");
        java.lang.String str10 = partner3.getPassword();
        partner3.login("hi!", "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test25044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25044");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("partner", "hi!");
        double double12 = partner3.getHourlyRate();
        partner3.setVerified(true);
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getAccountType();
        double double17 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test25045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25045");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        partner3.login("", "");
        java.lang.String str15 = partner3.getPassword();
        double double16 = partner3.getHourlyRate();
        double double17 = partner3.getHourlyRate();
        boolean boolean18 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.String str21 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test25046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25046");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test25047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25047");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getEmail();
        partner3.login("partner", "partner");
        partner3.login("hi!", "");
        partner3.logout();
        boolean boolean20 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test25048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25048");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        partner3.setVerified(true);
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
    }

    @Test
    public void test25049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25049");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getEmail();
        partner3.login("", "partner");
        java.lang.String str17 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str20 = partner3.getAccountType();
        double double21 = partner3.getHourlyRate();
        java.lang.String str22 = partner3.getID();
        java.lang.String str23 = partner3.getAccountType();
        java.lang.String str24 = partner3.getID();
        boolean boolean25 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test25050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25050");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getID();
        partner3.logout();
        java.lang.String str16 = partner3.getID();
        double double17 = partner3.getHourlyRate();
        java.lang.String str18 = partner3.getID();
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test25051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25051");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getAccountType();
        partner3.login("partner", "hi!");
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getPassword();
        java.lang.String str19 = partner3.getID();
        partner3.login("", "partner");
        double double23 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 50.0d + "'", double23 == 50.0d);
    }

    @Test
    public void test25052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25052");
        model.Partner partner3 = new model.Partner("partner", "", "partner");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getPassword();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
    }

    @Test
    public void test25053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25053");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getAccountType();
        partner3.logout();
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test25054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25054");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "partner");
        partner3.login("hi!", "partner");
        partner3.login("", "partner");
        java.lang.String str10 = partner3.getPassword();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getEmail();
        double double16 = partner3.getHourlyRate();
        java.lang.String str17 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test25055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25055");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getAccountType();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
    }

    @Test
    public void test25056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25056");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getEmail();
        partner3.login("hi!", "partner");
        java.lang.String str16 = partner3.getEmail();
        double double17 = partner3.getHourlyRate();
        double double18 = partner3.getHourlyRate();
        java.lang.String str19 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
    }

    @Test
    public void test25057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25057");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str17 = partner3.getID();
        partner3.logout();
        boolean boolean19 = partner3.isVerified();
        java.lang.String str20 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test25058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25058");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        boolean boolean10 = partner3.isVerified();
        partner3.viewProfile();
        partner3.login("", "hi!");
        double double15 = partner3.getHourlyRate();
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str19 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test25059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25059");
        model.Partner partner3 = new model.Partner("", "", "");
        partner3.viewProfile();
        double double5 = partner3.getHourlyRate();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test25060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25060");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getPassword();
        double double14 = partner3.getHourlyRate();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test25061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25061");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getAccountType();
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.login("partner", "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test25062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25062");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getID();
        boolean boolean11 = partner3.isVerified();
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test25063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25063");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str8 = partner3.getID();
        partner3.login("hi!", "partner");
        double double12 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str14 = partner3.getEmail();
        double double15 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test25064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25064");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.setVerified(false);
        partner3.logout();
        partner3.viewProfile();
        partner3.login("partner", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test25065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25065");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getID();
        partner3.logout();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str16 = partner3.getEmail();
        partner3.viewProfile();
        double double18 = partner3.getHourlyRate();
        partner3.login("", "");
        java.lang.String str22 = partner3.getEmail();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test25066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25066");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getPassword();
        partner3.login("", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str16 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25067");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str16 = partner3.getEmail();
        partner3.logout();
        boolean boolean18 = partner3.isVerified();
        partner3.setVerified(false);
        partner3.setVerified(false);
        java.lang.String str23 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
    }

    @Test
    public void test25068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25068");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        double double10 = partner3.getHourlyRate();
        partner3.setVerified(true);
        boolean boolean13 = partner3.isVerified();
        partner3.login("", "hi!");
        partner3.login("partner", "hi!");
        boolean boolean20 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test25069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25069");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        partner3.setVerified(true);
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getEmail();
        java.lang.String str20 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.String str23 = partner3.getAccountType();
        partner3.login("partner", "");
        double double27 = partner3.getHourlyRate();
        java.lang.String str28 = partner3.getID();
        partner3.login("hi!", "partner");
        java.lang.String str32 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 50.0d + "'", double27 == 50.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "partner" + "'", str32, "partner");
    }

    @Test
    public void test25070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25070");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean12 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getAccountType();
        partner3.login("", "partner");
        partner3.login("", "partner");
        partner3.viewProfile();
        java.lang.String str24 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "partner" + "'", str24, "partner");
    }

    @Test
    public void test25071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25071");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getAccountType();
        double double14 = partner3.getHourlyRate();
        partner3.login("hi!", "partner");
        boolean boolean18 = partner3.isVerified();
        partner3.logout();
        java.lang.String str20 = partner3.getPassword();
        java.lang.String str21 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test25072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25072");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        double double8 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getAccountType();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test25073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25073");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
    }

    @Test
    public void test25074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25074");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getEmail();
        partner3.setVerified(false);
        boolean boolean12 = partner3.isVerified();
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test25075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25075");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        boolean boolean10 = partner3.isVerified();
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getID();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test25076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25076");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "hi!");
        partner3.logout();
        partner3.login("", "hi!");
        partner3.logout();
        java.lang.String str15 = partner3.getID();
        boolean boolean16 = partner3.isVerified();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test25077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25077");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.setVerified(true);
        java.lang.String str6 = partner3.getPassword();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "partner");
        java.lang.String str12 = partner3.getAccountType();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
    }

    @Test
    public void test25078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25078");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str9 = partner3.getAccountType();
        double double10 = partner3.getHourlyRate();
        double double11 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test25079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25079");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str16 = partner3.getPassword();
        partner3.login("", "");
        java.lang.String str20 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test25080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25080");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getEmail();
        partner3.logout();
        partner3.login("partner", "");
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getAccountType();
        java.lang.String str19 = partner3.getPassword();
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test25081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25081");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getEmail();
        partner3.login("", "partner");
        partner3.setVerified(true);
        java.lang.String str19 = partner3.getPassword();
        java.lang.String str20 = partner3.getPassword();
        double double21 = partner3.getHourlyRate();
        java.lang.String str22 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.String str25 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test25082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25082");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        partner3.login("", "partner");
        partner3.logout();
        partner3.login("", "partner");
        java.lang.String str18 = partner3.getAccountType();
        java.lang.String str19 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test25083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25083");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getPassword();
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test25084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25084");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        double double7 = partner3.getHourlyRate();
        partner3.logout();
        boolean boolean9 = partner3.isVerified();
        partner3.login("hi!", "hi!");
        java.lang.String str13 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.setVerified(true);
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test25085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25085");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test25086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25086");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        partner3.login("hi!", "");
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getPassword();
        java.lang.String str19 = partner3.getID();
        partner3.login("partner", "partner");
        java.lang.String str23 = partner3.getAccountType();
        partner3.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
    }

    @Test
    public void test25087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25087");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        partner3.setVerified(true);
        double double12 = partner3.getHourlyRate();
        partner3.viewProfile();
        partner3.logout();
        boolean boolean15 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test25088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25088");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getID();
        partner3.logout();
        partner3.logout();
        partner3.setVerified(false);
        double double16 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test25089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25089");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getAccountType();
        partner3.login("partner", "hi!");
        java.lang.String str16 = partner3.getEmail();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test25090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25090");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
    }

    @Test
    public void test25091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25091");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.logout();
        partner3.setVerified(true);
        partner3.setVerified(true);
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
    }

    @Test
    public void test25092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25092");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getPassword();
        partner3.login("", "hi!");
        boolean boolean17 = partner3.isVerified();
        partner3.logout();
        boolean boolean19 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test25093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25093");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(true);
        partner3.login("hi!", "partner");
        boolean boolean16 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str18 = partner3.getAccountType();
        partner3.setVerified(true);
        java.lang.String str21 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test25094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25094");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str11 = partner3.getEmail();
        partner3.login("partner", "hi!");
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getAccountType();
        java.lang.String str17 = partner3.getPassword();
        java.lang.String str18 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str20 = partner3.getID();
        boolean boolean21 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test25095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25095");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        partner3.logout();
        partner3.logout();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test25096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25096");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25097");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getPassword();
        partner3.login("partner", "");
        java.lang.String str18 = partner3.getEmail();
        java.lang.String str19 = partner3.getAccountType();
        java.lang.String str20 = partner3.getAccountType();
        java.lang.String str21 = partner3.getID();
        double double22 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
    }

    @Test
    public void test25098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25098");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        partner3.login("", "");
        java.lang.String str15 = partner3.getPassword();
        double double16 = partner3.getHourlyRate();
        double double17 = partner3.getHourlyRate();
        partner3.setVerified(false);
        boolean boolean20 = partner3.isVerified();
        boolean boolean21 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test25099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25099");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getPassword();
        partner3.login("", "partner");
        java.lang.String str14 = partner3.getPassword();
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test25100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25100");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        partner3.login("", "");
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getID();
        java.lang.String str17 = partner3.getAccountType();
        boolean boolean18 = partner3.isVerified();
        partner3.login("", "hi!");
        java.lang.String str22 = partner3.getEmail();
        boolean boolean23 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test25101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25101");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str13 = partner3.getPassword();
        partner3.setVerified(true);
        java.lang.String str16 = partner3.getEmail();
        java.lang.String str17 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test25102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25102");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getPassword();
        partner3.logout();
        double double14 = partner3.getHourlyRate();
        partner3.login("hi!", "partner");
        java.lang.String str18 = partner3.getID();
        partner3.logout();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test25103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25103");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getEmail();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getPassword();
        partner3.viewProfile();
        double double14 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test25104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25104");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getEmail();
        boolean boolean9 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.String str12 = partner3.getEmail();
        partner3.logout();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25105");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.setVerified(true);
        partner3.logout();
        java.lang.String str16 = partner3.getID();
        boolean boolean17 = partner3.isVerified();
        partner3.setVerified(false);
        partner3.login("partner", "hi!");
        double double23 = partner3.getHourlyRate();
        java.lang.String str24 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 50.0d + "'", double23 == 50.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test25106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25106");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        partner3.viewProfile();
        boolean boolean8 = partner3.isVerified();
        double double9 = partner3.getHourlyRate();
        boolean boolean10 = partner3.isVerified();
        double double11 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test25107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25107");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        partner3.viewProfile();
        partner3.setVerified(false);
        boolean boolean13 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test25108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25108");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        double double11 = partner3.getHourlyRate();
        partner3.viewProfile();
        partner3.login("hi!", "partner");
        partner3.logout();
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str20 = partner3.getPassword();
        java.lang.String str21 = partner3.getAccountType();
        partner3.logout();
        boolean boolean23 = partner3.isVerified();
        java.lang.String str24 = partner3.getPassword();
        java.lang.String str25 = partner3.getID();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test25109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25109");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getAccountType();
        partner3.login("partner", "hi!");
        partner3.login("", "partner");
        partner3.login("hi!", "partner");
        partner3.setVerified(false);
        partner3.login("partner", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test25110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25110");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        double double14 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str16 = partner3.getAccountType();
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25111");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getPassword();
        partner3.login("partner", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test25112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25112");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getPassword();
        boolean boolean14 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.String str17 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test25113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25113");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        partner3.login("", "partner");
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getEmail();
        double double16 = partner3.getHourlyRate();
        java.lang.String str17 = partner3.getPassword();
        partner3.logout();
        partner3.login("hi!", "");
        partner3.logout();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test25114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25114");
        model.Partner partner3 = new model.Partner("partner", "hi!", "");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getPassword();
        partner3.login("", "hi!");
        boolean boolean9 = partner3.isVerified();
        partner3.viewProfile();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test25115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25115");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        partner3.logout();
        partner3.setVerified(false);
        partner3.login("", "");
        partner3.viewProfile();
        java.lang.String str19 = partner3.getPassword();
        java.lang.String str20 = partner3.getAccountType();
        partner3.setVerified(true);
        java.lang.String str23 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test25116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25116");
        model.Partner partner3 = new model.Partner("partner", "", "partner");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getEmail();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test25117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25117");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getAccountType();
        partner3.login("hi!", "hi!");
        java.lang.String str17 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str20 = partner3.getPassword();
        java.lang.String str21 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
    }

    @Test
    public void test25118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25118");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        partner3.logout();
        partner3.login("partner", "");
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25119");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getID();
        boolean boolean14 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str16 = partner3.getID();
        boolean boolean17 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test25120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25120");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        partner3.logout();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str15 = partner3.getEmail();
        partner3.logout();
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getID();
        double double19 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
    }

    @Test
    public void test25121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25121");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        partner3.logout();
        boolean boolean11 = partner3.isVerified();
        partner3.logout();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getID();
        partner3.logout();
        double double16 = partner3.getHourlyRate();
        java.lang.String str17 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test25122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25122");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getEmail();
        partner3.viewProfile();
        partner3.login("hi!", "");
        java.lang.String str20 = partner3.getAccountType();
        java.lang.String str21 = partner3.getPassword();
        java.lang.String str22 = partner3.getID();
        boolean boolean23 = partner3.isVerified();
        partner3.logout();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test25123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25123");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        partner3.login("partner", "partner");
        java.lang.String str13 = partner3.getAccountType();
        partner3.login("", "hi!");
        partner3.viewProfile();
        partner3.logout();
        partner3.logout();
        partner3.login("partner", "partner");
        java.lang.String str23 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test25124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25124");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        partner3.setVerified(false);
        partner3.logout();
        partner3.setVerified(true);
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getEmail();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25125");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getPassword();
        partner3.logout();
        java.lang.String str11 = partner3.getPassword();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test25126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25126");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.logout();
        partner3.login("partner", "hi!");
        java.lang.String str13 = partner3.getID();
        partner3.logout();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str18 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test25127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25127");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.logout();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getAccountType();
        java.lang.String str17 = partner3.getAccountType();
        double double18 = partner3.getHourlyRate();
        java.lang.String str19 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
    }

    @Test
    public void test25128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25128");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str13 = partner3.getID();
        partner3.viewProfile();
        double double15 = partner3.getHourlyRate();
        partner3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test25129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25129");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.logout();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getAccountType();
        partner3.setVerified(false);
        partner3.setVerified(true);
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test25130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25130");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getAccountType();
        double double9 = partner3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
    }

    @Test
    public void test25131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25131");
        model.Partner partner3 = new model.Partner("partner", "", "");
        partner3.logout();
        double double5 = partner3.getHourlyRate();
        java.lang.String str6 = partner3.getAccountType();
        partner3.viewProfile();
        boolean boolean8 = partner3.isVerified();
        boolean boolean9 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25132");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        partner3.login("", "");
        java.lang.String str15 = partner3.getAccountType();
        partner3.login("hi!", "partner");
        java.lang.String str19 = partner3.getAccountType();
        partner3.setVerified(true);
        partner3.logout();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
    }

    @Test
    public void test25133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25133");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test25134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25134");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        partner3.logout();
        partner3.login("hi!", "partner");
        boolean boolean14 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25135");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getPassword();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str15 = partner3.getID();
        boolean boolean16 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str19 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test25136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25136");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.viewProfile();
        java.lang.String str5 = partner3.getPassword();
        boolean boolean6 = partner3.isVerified();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getID();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test25137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25137");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getPassword();
        double double13 = partner3.getHourlyRate();
        partner3.logout();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test25138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25138");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getPassword();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25139");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "");
        java.lang.String str12 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str14 = partner3.getID();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getAccountType();
        java.lang.String str17 = partner3.getPassword();
        java.lang.String str18 = partner3.getPassword();
        partner3.login("", "hi!");
        partner3.login("partner", "partner");
        java.lang.String str25 = partner3.getPassword();
        double double26 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 50.0d + "'", double26 == 50.0d);
    }

    @Test
    public void test25140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25140");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.setVerified(true);
        partner3.viewProfile();
        partner3.login("partner", "");
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test25141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25141");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        double double8 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test25142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25142");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.logout();
        partner3.setVerified(true);
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getPassword();
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test25143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25143");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        boolean boolean8 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str13 = partner3.getID();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getPassword();
        partner3.logout();
        java.lang.String str17 = partner3.getPassword();
        java.lang.String str18 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25144");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test25145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25145");
        model.Partner partner3 = new model.Partner("", "", "partner");
        partner3.login("partner", "partner");
        double double7 = partner3.getHourlyRate();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test25146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25146");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "partner");
        java.lang.String str10 = partner3.getEmail();
        partner3.login("", "hi!");
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getID();
        partner3.viewProfile();
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test25147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25147");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "");
        partner3.login("", "");
        partner3.logout();
        partner3.logout();
        partner3.login("partner", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test25148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25148");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "");
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test25149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25149");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test25150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25150");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test25151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25151");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getID();
        partner3.login("", "");
        java.lang.String str12 = partner3.getID();
        partner3.logout();
        partner3.viewProfile();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getPassword();
        java.lang.String str17 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test25152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25152");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.logout();
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.String str13 = partner3.getAccountType();
        double double14 = partner3.getHourlyRate();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test25153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25153");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getPassword();
        partner3.setVerified(true);
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25154");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        partner3.login("", "");
        java.lang.String str15 = partner3.getPassword();
        double double16 = partner3.getHourlyRate();
        double double17 = partner3.getHourlyRate();
        boolean boolean18 = partner3.isVerified();
        java.lang.String str19 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str23 = partner3.getID();
        double double24 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 50.0d + "'", double24 == 50.0d);
    }

    @Test
    public void test25155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25155");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25156");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        partner3.viewProfile();
        partner3.viewProfile();
        double double9 = partner3.getHourlyRate();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getAccountType();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
    }

    @Test
    public void test25157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25157");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getAccountType();
        partner3.viewProfile();
        boolean boolean14 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25158");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
    }

    @Test
    public void test25159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25159");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.logout();
        double double14 = partner3.getHourlyRate();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getID();
        partner3.viewProfile();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test25160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25160");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getID();
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getPassword();
        boolean boolean17 = partner3.isVerified();
        partner3.logout();
        partner3.login("partner", "hi!");
        java.lang.Class<?> wildcardClass22 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test25161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25161");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getPassword();
        double double11 = partner3.getHourlyRate();
        partner3.setVerified(false);
        partner3.login("hi!", "hi!");
        java.lang.String str17 = partner3.getAccountType();
        double double18 = partner3.getHourlyRate();
        java.lang.String str19 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test25162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25162");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        double double9 = partner3.getHourlyRate();
        double double10 = partner3.getHourlyRate();
        partner3.login("hi!", "hi!");
        double double14 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test25163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25163");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("", "partner");
        boolean boolean11 = partner3.isVerified();
        double double12 = partner3.getHourlyRate();
        double double13 = partner3.getHourlyRate();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.setVerified(true);
        partner3.login("hi!", "hi!");
        java.lang.String str23 = partner3.getID();
        java.lang.String str24 = partner3.getPassword();
        java.lang.String str25 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test25164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25164");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str7 = partner3.getID();
        boolean boolean8 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test25165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25165");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getAccountType();
        partner3.login("partner", "partner");
        boolean boolean10 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test25166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25166");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        partner3.setVerified(true);
        partner3.login("", "");
        partner3.logout();
        boolean boolean14 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test25167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25167");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getAccountType();
        boolean boolean9 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test25168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25168");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        partner3.login("", "");
        double double15 = partner3.getHourlyRate();
        boolean boolean16 = partner3.isVerified();
        partner3.login("partner", "partner");
        java.lang.String str20 = partner3.getAccountType();
        partner3.viewProfile();
        double double22 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
    }

    @Test
    public void test25169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25169");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.login("", "partner");
        double double9 = partner3.getHourlyRate();
        partner3.login("hi!", "");
        partner3.logout();
        partner3.setVerified(false);
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
    }

    @Test
    public void test25170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25170");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.logout();
        java.lang.String str13 = partner3.getID();
        boolean boolean14 = partner3.isVerified();
        partner3.login("partner", "partner");
        java.lang.String str18 = partner3.getPassword();
        java.lang.String str19 = partner3.getPassword();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test25171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25171");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        double double10 = partner3.getHourlyRate();
        boolean boolean11 = partner3.isVerified();
        double double12 = partner3.getHourlyRate();
        double double13 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str15 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test25172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25172");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        partner3.login("", "");
        java.lang.String str15 = partner3.getPassword();
        double double16 = partner3.getHourlyRate();
        partner3.login("hi!", "");
        java.lang.String str20 = partner3.getAccountType();
        java.lang.String str21 = partner3.getID();
        java.lang.String str22 = partner3.getID();
        java.lang.String str23 = partner3.getAccountType();
        java.lang.String str24 = partner3.getID();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test25173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25173");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.login("partner", "");
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test25174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25174");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        partner3.setVerified(true);
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getAccountType();
        partner3.viewProfile();
        boolean boolean17 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test25175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25175");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        boolean boolean9 = partner3.isVerified();
        partner3.login("", "partner");
        partner3.setVerified(true);
        partner3.login("partner", "hi!");
        partner3.logout();
        java.lang.String str19 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str22 = partner3.getEmail();
        boolean boolean23 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test25176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25176");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        partner3.setVerified(true);
        partner3.viewProfile();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test25177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25177");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.setVerified(true);
        partner3.setVerified(true);
        partner3.login("", "partner");
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getEmail();
        boolean boolean13 = partner3.isVerified();
        partner3.logout();
        java.lang.String str15 = partner3.getID();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test25178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25178");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("partner", "hi!");
        partner3.login("", "hi!");
        partner3.login("", "hi!");
        partner3.login("", "");
        partner3.logout();
        boolean boolean22 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test25179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25179");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(true);
        partner3.viewProfile();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getID();
        double double16 = partner3.getHourlyRate();
        boolean boolean17 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test25180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25180");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
    }

    @Test
    public void test25181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25181");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getEmail();
        boolean boolean15 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test25182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25182");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        partner3.logout();
        partner3.login("partner", "hi!");
        java.lang.String str15 = partner3.getPassword();
        double double16 = partner3.getHourlyRate();
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str20 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test25183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25183");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        partner3.logout();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getEmail();
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test25184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25184");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getPassword();
        partner3.setVerified(true);
        partner3.logout();
        partner3.login("hi!", "");
        java.lang.String str17 = partner3.getEmail();
        java.lang.String str18 = partner3.getPassword();
        partner3.logout();
        java.lang.String str20 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test25185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25185");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        partner3.logout();
        java.lang.String str13 = partner3.getID();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test25186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25186");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getID();
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test25187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25187");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        boolean boolean8 = partner3.isVerified();
        partner3.login("hi!", "partner");
        partner3.logout();
        java.lang.String str13 = partner3.getAccountType();
        boolean boolean14 = partner3.isVerified();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25188");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        partner3.login("", "partner");
        partner3.viewProfile();
        boolean boolean16 = partner3.isVerified();
        boolean boolean17 = partner3.isVerified();
        partner3.logout();
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test25189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25189");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getAccountType();
        double double11 = partner3.getHourlyRate();
        double double12 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test25190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25190");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.logout();
        double double14 = partner3.getHourlyRate();
        double double15 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str17 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        double double20 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
    }

    @Test
    public void test25191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25191");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "partner");
        partner3.login("hi!", "hi!");
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str16 = partner3.getPassword();
        partner3.logout();
        double double18 = partner3.getHourlyRate();
        java.lang.String str19 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test25192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25192");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        partner3.login("partner", "");
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getID();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test25193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25193");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str14 = partner3.getPassword();
        partner3.login("", "hi!");
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25194");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        boolean boolean5 = partner3.isVerified();
        partner3.setVerified(true);
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test25195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25195");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.logout();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str15 = partner3.getID();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test25196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25196");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        boolean boolean9 = partner3.isVerified();
        partner3.login("", "partner");
        boolean boolean13 = partner3.isVerified();
        partner3.login("", "hi!");
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test25197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25197");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getEmail();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.login("hi!", "partner");
        double double11 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getEmail();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25198");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test25199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25199");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        partner3.login("", "");
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getID();
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getAccountType();
        partner3.logout();
        partner3.setVerified(false);
        boolean boolean22 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test25200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25200");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        double double13 = partner3.getHourlyRate();
        boolean boolean14 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getID();
        partner3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test25201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25201");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getID();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str17 = partner3.getEmail();
        java.lang.String str18 = partner3.getPassword();
        java.lang.String str19 = partner3.getAccountType();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
    }

    @Test
    public void test25202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25202");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        partner3.logout();
        boolean boolean13 = partner3.isVerified();
        boolean boolean14 = partner3.isVerified();
        java.lang.String str15 = partner3.getPassword();
        double double16 = partner3.getHourlyRate();
        java.lang.String str17 = partner3.getEmail();
        java.lang.String str18 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25203");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.logout();
        partner3.login("", "");
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test25204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25204");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getID();
        double double5 = partner3.getHourlyRate();
        java.lang.String str6 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test25205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25205");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getPassword();
        double double13 = partner3.getHourlyRate();
        boolean boolean14 = partner3.isVerified();
        double double15 = partner3.getHourlyRate();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test25206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25206");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        double double13 = partner3.getHourlyRate();
        boolean boolean14 = partner3.isVerified();
        partner3.logout();
        java.lang.String str16 = partner3.getID();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str20 = partner3.getID();
        partner3.logout();
        java.lang.String str22 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "partner" + "'", str22, "partner");
    }

    @Test
    public void test25207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25207");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getPassword();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getEmail();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25208");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        partner3.viewProfile();
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getPassword();
        partner3.login("partner", "partner");
        boolean boolean18 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test25209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25209");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getPassword();
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25210");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        partner3.setVerified(true);
        partner3.setVerified(true);
        boolean boolean16 = partner3.isVerified();
        partner3.viewProfile();
        partner3.login("partner", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test25211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25211");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        double double13 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str15 = partner3.getPassword();
        partner3.logout();
        partner3.setVerified(true);
        double double19 = partner3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
    }

    @Test
    public void test25212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25212");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        partner3.login("", "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test25213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25213");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        double double4 = partner3.getHourlyRate();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getAccountType();
        partner3.login("partner", "");
        partner3.login("partner", "");
        partner3.logout();
        java.lang.String str14 = partner3.getPassword();
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getEmail();
        partner3.login("", "partner");
        double double20 = partner3.getHourlyRate();
        partner3.login("hi!", "");
        boolean boolean24 = partner3.isVerified();
        java.lang.String str25 = partner3.getPassword();
        partner3.viewProfile();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "partner" + "'", str25, "partner");
    }

    @Test
    public void test25214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25214");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        partner3.setVerified(false);
        partner3.setVerified(true);
        boolean boolean17 = partner3.isVerified();
        partner3.login("", "partner");
        java.lang.String str21 = partner3.getEmail();
        java.lang.String str22 = partner3.getAccountType();
        java.lang.String str23 = partner3.getPassword();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "partner" + "'", str22, "partner");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test25215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25215");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        double double10 = partner3.getHourlyRate();
        boolean boolean11 = partner3.isVerified();
        double double12 = partner3.getHourlyRate();
        boolean boolean13 = partner3.isVerified();
        boolean boolean14 = partner3.isVerified();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getID();
        partner3.logout();
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test25216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25216");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        partner3.login("", "hi!");
        partner3.viewProfile();
        double double15 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str17 = partner3.getAccountType();
        partner3.login("", "");
        partner3.logout();
        partner3.logout();
        java.lang.Class<?> wildcardClass23 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test25217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25217");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.viewProfile();
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str18 = partner3.getAccountType();
        boolean boolean19 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test25218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25218");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getID();
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getEmail();
        boolean boolean14 = partner3.isVerified();
        java.lang.String str15 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.String str18 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test25219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25219");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        partner3.logout();
        partner3.setVerified(false);
        partner3.login("", "");
        partner3.viewProfile();
        java.lang.String str19 = partner3.getPassword();
        java.lang.String str20 = partner3.getAccountType();
        java.lang.String str21 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str23 = partner3.getAccountType();
        double double24 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 50.0d + "'", double24 == 50.0d);
    }

    @Test
    public void test25220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25220");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        partner3.viewProfile();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test25221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25221");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        partner3.setVerified(true);
        double double12 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25222");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("", "partner");
        boolean boolean11 = partner3.isVerified();
        double double12 = partner3.getHourlyRate();
        double double13 = partner3.getHourlyRate();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.setVerified(true);
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        java.lang.String str24 = partner3.getPassword();
        double double25 = partner3.getHourlyRate();
        boolean boolean26 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 50.0d + "'", double25 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test25223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25223");
        model.Partner partner3 = new model.Partner("", "", "");
        partner3.viewProfile();
        double double5 = partner3.getHourlyRate();
        java.lang.String str6 = partner3.getEmail();
        partner3.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test25224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25224");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getID();
        partner3.logout();
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean18 = partner3.isVerified();
        double double19 = partner3.getHourlyRate();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
    }

    @Test
    public void test25225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25225");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        java.lang.String str12 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str14 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test25226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25226");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getID();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test25227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25227");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getPassword();
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getEmail();
        partner3.login("", "");
        partner3.viewProfile();
        java.lang.String str19 = partner3.getEmail();
        java.lang.String str20 = partner3.getPassword();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test25228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25228");
        model.Partner partner3 = new model.Partner("", "", "");
        partner3.viewProfile();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getEmail();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getPassword();
        boolean boolean11 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str13 = partner3.getEmail();
        boolean boolean14 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test25229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25229");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        double double12 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test25230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25230");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        double double14 = partner3.getHourlyRate();
        partner3.setVerified(false);
        java.lang.String str17 = partner3.getAccountType();
        java.lang.String str18 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test25231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25231");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("", "hi!");
        java.lang.String str11 = partner3.getEmail();
        partner3.logout();
        java.lang.String str13 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25232");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getEmail();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getID();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getAccountType();
        partner3.setVerified(true);
        partner3.viewProfile();
        java.lang.String str17 = partner3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test25233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25233");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        partner3.login("hi!", "");
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getEmail();
        double double19 = partner3.getHourlyRate();
        boolean boolean20 = partner3.isVerified();
        java.lang.String str21 = partner3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test25234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25234");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getID();
        partner3.logout();
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str18 = partner3.getAccountType();
        partner3.setVerified(false);
        java.lang.String str21 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test25235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25235");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        boolean boolean8 = partner3.isVerified();
        partner3.login("hi!", "partner");
        partner3.logout();
        java.lang.String str13 = partner3.getID();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str17 = partner3.getAccountType();
        partner3.login("", "hi!");
        java.lang.String str21 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test25236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25236");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        boolean boolean12 = partner3.isVerified();
        partner3.logout();
        java.lang.String str14 = partner3.getID();
        partner3.setVerified(false);
        double double17 = partner3.getHourlyRate();
        boolean boolean18 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test25237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25237");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        partner3.login("partner", "");
        boolean boolean11 = partner3.isVerified();
        partner3.setVerified(true);
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str17 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test25238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25238");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getPassword();
        boolean boolean15 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test25239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25239");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        partner3.logout();
        partner3.login("partner", "hi!");
        java.lang.String str15 = partner3.getPassword();
        partner3.login("partner", "");
        double double19 = partner3.getHourlyRate();
        java.lang.String str20 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str22 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test25240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25240");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        partner3.viewProfile();
        boolean boolean13 = partner3.isVerified();
        boolean boolean14 = partner3.isVerified();
        java.lang.String str15 = partner3.getAccountType();
        partner3.login("hi!", "hi!");
        boolean boolean19 = partner3.isVerified();
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test25241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25241");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.logout();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25242");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        partner3.logout();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getPassword();
        partner3.setVerified(true);
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test25243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25243");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.login("partner", "hi!");
        partner3.viewProfile();
        partner3.login("", "partner");
        double double16 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test25244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25244");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getEmail();
        double double13 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str15 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test25245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25245");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str11 = partner3.getEmail();
        partner3.viewProfile();
        partner3.login("hi!", "hi!");
        double double16 = partner3.getHourlyRate();
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25246");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getID();
        double double11 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test25247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25247");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.logout();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test25248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25248");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getAccountType();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
    }

    @Test
    public void test25249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25249");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getID();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25250");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.login("hi!", "");
        partner3.viewProfile();
        boolean boolean14 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        java.lang.String str17 = partner3.getPassword();
        double double18 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
    }

    @Test
    public void test25251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25251");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getID();
        boolean boolean16 = partner3.isVerified();
        java.lang.String str17 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test25252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25252");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        partner3.setVerified(false);
        partner3.viewProfile();
        boolean boolean12 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test25253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25253");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        double double8 = partner3.getHourlyRate();
        partner3.logout();
        partner3.logout();
        partner3.setVerified(true);
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getPassword();
        partner3.login("partner", "partner");
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test25254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25254");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getEmail();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getID();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getPassword();
        partner3.setVerified(true);
        boolean boolean15 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test25255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25255");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.logout();
        java.lang.String str10 = partner3.getPassword();
        java.lang.String str11 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25256");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        partner3.login("", "hi!");
        double double13 = partner3.getHourlyRate();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getEmail();
        double double16 = partner3.getHourlyRate();
        java.lang.String str17 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test25257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25257");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str16 = partner3.getPassword();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25258");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        partner3.login("", "hi!");
        double double13 = partner3.getHourlyRate();
        double double14 = partner3.getHourlyRate();
        partner3.setVerified(true);
        partner3.viewProfile();
        partner3.login("", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test25259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25259");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("partner", "hi!");
        partner3.login("hi!", "");
        partner3.setVerified(false);
        partner3.logout();
        partner3.logout();
        boolean boolean19 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test25260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25260");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        partner3.login("", "partner");
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str17 = partner3.getEmail();
        partner3.login("hi!", "hi!");
        partner3.login("partner", "partner");
        java.lang.String str24 = partner3.getAccountType();
        double double25 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "partner" + "'", str24, "partner");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 50.0d + "'", double25 == 50.0d);
    }

    @Test
    public void test25261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25261");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        boolean boolean7 = partner3.isVerified();
        boolean boolean8 = partner3.isVerified();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test25262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25262");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        partner3.login("", "hi!");
        partner3.viewProfile();
        double double15 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str17 = partner3.getAccountType();
        partner3.login("", "");
        partner3.logout();
        java.lang.String str22 = partner3.getID();
        java.lang.String str23 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
    }

    @Test
    public void test25263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25263");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getID();
        boolean boolean10 = partner3.isVerified();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.setVerified(false);
        java.lang.String str17 = partner3.getID();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test25264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25264");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.setVerified(true);
        partner3.login("", "hi!");
        boolean boolean9 = partner3.isVerified();
        partner3.logout();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getID();
        partner3.logout();
        partner3.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25265");
        model.Partner partner3 = new model.Partner("", "", "");
        partner3.viewProfile();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getEmail();
        partner3.logout();
        partner3.logout();
        boolean boolean9 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test25266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25266");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getID();
        boolean boolean8 = partner3.isVerified();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        partner3.viewProfile();
        partner3.login("hi!", "");
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getEmail();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25267");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getEmail();
        partner3.login("partner", "");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25268");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getPassword();
        partner3.logout();
        java.lang.String str14 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str20 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test25269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25269");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        boolean boolean12 = partner3.isVerified();
        partner3.login("", "partner");
        partner3.login("", "partner");
        java.lang.String str19 = partner3.getEmail();
        java.lang.String str20 = partner3.getPassword();
        java.lang.String str21 = partner3.getID();
        java.lang.String str22 = partner3.getPassword();
        java.lang.String str23 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test25270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25270");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        partner3.setVerified(true);
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getEmail();
        java.lang.String str20 = partner3.getAccountType();
        java.lang.String str21 = partner3.getAccountType();
        java.lang.String str22 = partner3.getID();
        partner3.viewProfile();
        partner3.logout();
        java.lang.Class<?> wildcardClass25 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test25271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25271");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        partner3.logout();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        double double9 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
    }

    @Test
    public void test25272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25272");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getEmail();
        partner3.logout();
        partner3.login("partner", "");
        partner3.logout();
        java.lang.String str18 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test25273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25273");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getEmail();
        boolean boolean11 = partner3.isVerified();
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getID();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test25274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25274");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        boolean boolean6 = partner3.isVerified();
        java.lang.String str7 = partner3.getEmail();
        partner3.login("hi!", "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test25275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25275");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.login("", "");
        java.lang.String str16 = partner3.getID();
        partner3.logout();
        java.lang.String str18 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25276");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.logout();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getEmail();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test25277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25277");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.login("", "partner");
        double double9 = partner3.getHourlyRate();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getID();
        partner3.login("partner", "partner");
        partner3.logout();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25278");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getEmail();
        boolean boolean6 = partner3.isVerified();
        java.lang.String str7 = partner3.getAccountType();
        partner3.login("partner", "");
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25279");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.logout();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getPassword();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25280");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getID();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test25281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25281");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getID();
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getEmail();
        boolean boolean16 = partner3.isVerified();
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str20 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test25282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25282");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.login("hi!", "");
        partner3.viewProfile();
        boolean boolean14 = partner3.isVerified();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getPassword();
        double double17 = partner3.getHourlyRate();
        java.lang.String str18 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25283");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        partner3.login("partner", "");
        java.lang.String str9 = partner3.getAccountType();
        partner3.logout();
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getPassword();
        partner3.viewProfile();
        partner3.login("hi!", "hi!");
        partner3.logout();
        java.lang.String str18 = partner3.getAccountType();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test25284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25284");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getPassword();
        double double11 = partner3.getHourlyRate();
        partner3.viewProfile();
        double double13 = partner3.getHourlyRate();
        boolean boolean14 = partner3.isVerified();
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getAccountType();
        partner3.setVerified(false);
        java.lang.String str19 = partner3.getID();
        java.lang.String str20 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test25285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25285");
        model.Partner partner3 = new model.Partner("hi!", "partner", "hi!");
        double double4 = partner3.getHourlyRate();
        java.lang.String str5 = partner3.getID();
        double double6 = partner3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
    }

    @Test
    public void test25286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25286");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getID();
        partner3.viewProfile();
        partner3.viewProfile();
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getPassword();
        double double15 = partner3.getHourlyRate();
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test25287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25287");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.login("", "partner");
        java.lang.String str9 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.logout();
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test25288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25288");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "partner");
        partner3.login("hi!", "partner");
        partner3.login("", "partner");
        java.lang.String str10 = partner3.getPassword();
        partner3.viewProfile();
        partner3.setVerified(false);
        double double14 = partner3.getHourlyRate();
        boolean boolean15 = partner3.isVerified();
        partner3.setVerified(false);
        boolean boolean18 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test25289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25289");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getID();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test25290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25290");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getPassword();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
    }

    @Test
    public void test25291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25291");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getAccountType();
        partner3.login("partner", "hi!");
        partner3.login("", "partner");
        double double23 = partner3.getHourlyRate();
        java.lang.String str24 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str26 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 50.0d + "'", double23 == 50.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "partner" + "'", str24, "partner");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test25292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25292");
        model.Partner partner3 = new model.Partner("partner", "hi!", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.login("hi!", "");
        double double11 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test25293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25293");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getAccountType();
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getPassword();
        boolean boolean13 = partner3.isVerified();
        partner3.login("hi!", "");
        partner3.login("partner", "partner");
        java.lang.String str20 = partner3.getAccountType();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
    }

    @Test
    public void test25294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25294");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        partner3.login("partner", "hi!");
        double double13 = partner3.getHourlyRate();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getID();
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test25295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25295");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.login("partner", "hi!");
        java.lang.String str12 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getEmail();
        java.lang.String str17 = partner3.getEmail();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test25296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25296");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.logout();
        partner3.logout();
        partner3.login("", "");
        partner3.logout();
        double double10 = partner3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }

    @Test
    public void test25297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25297");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getAccountType();
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        partner3.login("partner", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test25298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25298");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getAccountType();
        partner3.login("partner", "partner");
        java.lang.String str18 = partner3.getAccountType();
        java.lang.String str19 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test25299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25299");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
    }

    @Test
    public void test25300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25300");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        partner3.logout();
        boolean boolean12 = partner3.isVerified();
        double double13 = partner3.getHourlyRate();
        boolean boolean14 = partner3.isVerified();
        java.lang.String str15 = partner3.getPassword();
        double double16 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str18 = partner3.getAccountType();
        double double19 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
    }

    @Test
    public void test25301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25301");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        double double4 = partner3.getHourlyRate();
        double double5 = partner3.getHourlyRate();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.login("", "hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
    }

    @Test
    public void test25302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25302");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str12 = partner3.getAccountType();
        partner3.login("hi!", "partner");
        partner3.viewProfile();
        double double17 = partner3.getHourlyRate();
        partner3.login("", "");
        partner3.login("hi!", "");
        partner3.logout();
        partner3.viewProfile();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test25303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25303");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        partner3.login("partner", "partner");
        java.lang.String str13 = partner3.getAccountType();
        partner3.login("", "hi!");
        partner3.viewProfile();
        java.lang.String str18 = partner3.getPassword();
        double double19 = partner3.getHourlyRate();
        java.lang.String str20 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
    }

    @Test
    public void test25304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25304");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.setVerified(true);
        java.lang.String str6 = partner3.getPassword();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        double double9 = partner3.getHourlyRate();
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        partner3.login("partner", "hi!");
        java.lang.String str15 = partner3.getEmail();
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test25305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25305");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "");
        java.lang.String str12 = partner3.getAccountType();
        partner3.logout();
        boolean boolean14 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.String str17 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str19 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test25306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25306");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.viewProfile();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getPassword();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getID();
        boolean boolean14 = partner3.isVerified();
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getPassword();
        java.lang.String str17 = partner3.getAccountType();
        java.lang.String str18 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test25307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25307");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        partner3.viewProfile();
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getEmail();
        boolean boolean15 = partner3.isVerified();
        partner3.logout();
        partner3.login("hi!", "hi!");
        java.lang.String str20 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test25308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25308");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getAccountType();
        partner3.login("", "hi!");
        partner3.viewProfile();
        java.lang.String str20 = partner3.getEmail();
        java.lang.String str21 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test25309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25309");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.logout();
        partner3.login("", "hi!");
        java.lang.String str13 = partner3.getAccountType();
        partner3.logout();
        partner3.viewProfile();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test25310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25310");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str14 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test25311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25311");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        double double13 = partner3.getHourlyRate();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str16 = partner3.getAccountType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test25312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25312");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.setVerified(true);
        partner3.login("", "hi!");
        partner3.viewProfile();
        partner3.login("hi!", "");
        partner3.login("", "");
    }

    @Test
    public void test25313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25313");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        partner3.login("", "hi!");
        boolean boolean14 = partner3.isVerified();
        java.lang.String str15 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test25314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25314");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        double double4 = partner3.getHourlyRate();
        partner3.viewProfile();
        partner3.viewProfile();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
    }

    @Test
    public void test25315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25315");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        partner3.logout();
        partner3.logout();
        java.lang.String str7 = partner3.getID();
        partner3.logout();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25316");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str12 = partner3.getAccountType();
        partner3.logout();
        partner3.logout();
        java.lang.String str15 = partner3.getID();
        double double16 = partner3.getHourlyRate();
        java.lang.String str17 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.logout();
        double double20 = partner3.getHourlyRate();
        boolean boolean21 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test25317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25317");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getAccountType();
        partner3.logout();
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test25318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25318");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        boolean boolean10 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test25319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25319");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getID();
        boolean boolean15 = partner3.isVerified();
        partner3.login("partner", "partner");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test25320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25320");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getPassword();
        partner3.login("", "hi!");
        java.lang.String str15 = partner3.getAccountType();
        partner3.login("hi!", "");
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str22 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test25321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25321");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        partner3.viewProfile();
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test25322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25322");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        partner3.setVerified(true);
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getEmail();
        java.lang.String str20 = partner3.getEmail();
        java.lang.String str21 = partner3.getAccountType();
        java.lang.String str22 = partner3.getEmail();
        java.lang.String str23 = partner3.getAccountType();
        partner3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
    }

    @Test
    public void test25323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25323");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "");
        boolean boolean12 = partner3.isVerified();
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.setVerified(false);
        boolean boolean19 = partner3.isVerified();
        boolean boolean20 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test25324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25324");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getAccountType();
        boolean boolean13 = partner3.isVerified();
        partner3.setVerified(false);
        double double16 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getEmail();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test25325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25325");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str11 = partner3.getEmail();
        partner3.viewProfile();
        boolean boolean13 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25326");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test25327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25327");
        model.Partner partner3 = new model.Partner("", "hi!", "");
        partner3.login("hi!", "hi!");
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getPassword();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25328");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getID();
        partner3.login("", "partner");
        partner3.setVerified(false);
        double double17 = partner3.getHourlyRate();
        java.lang.String str18 = partner3.getEmail();
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test25329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25329");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getAccountType();
        partner3.setVerified(true);
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test25330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25330");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getEmail();
        boolean boolean14 = partner3.isVerified();
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getAccountType();
        partner3.login("", "");
        double double20 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
    }

    @Test
    public void test25331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25331");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.logout();
        partner3.logout();
        partner3.login("", "hi!");
        java.lang.String str23 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test25332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25332");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getAccountType();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test25333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25333");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getID();
        boolean boolean16 = partner3.isVerified();
        java.lang.String str17 = partner3.getAccountType();
        double double18 = partner3.getHourlyRate();
        boolean boolean19 = partner3.isVerified();
        boolean boolean20 = partner3.isVerified();
        java.lang.String str21 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
    }

    @Test
    public void test25334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25334");
        model.Partner partner3 = new model.Partner("partner", "", "");
        partner3.logout();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.login("", "partner");
        java.lang.String str10 = partner3.getPassword();
        boolean boolean11 = partner3.isVerified();
        partner3.login("", "partner");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test25335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25335");
        model.Partner partner3 = new model.Partner("", "hi!", "hi!");
        partner3.login("partner", "partner");
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test25336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25336");
        model.Partner partner3 = new model.Partner("", "hi!", "hi!");
        partner3.login("partner", "partner");
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getAccountType();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test25337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25337");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        partner3.login("", "partner");
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getEmail();
        double double16 = partner3.getHourlyRate();
        java.lang.String str17 = partner3.getPassword();
        partner3.login("", "");
        java.lang.String str21 = partner3.getAccountType();
        double double22 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
    }

    @Test
    public void test25338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25338");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.login("partner", "partner");
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getID();
        double double13 = partner3.getHourlyRate();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test25339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25339");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "partner");
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getEmail();
        double double12 = partner3.getHourlyRate();
        partner3.setVerified(true);
        boolean boolean15 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test25340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25340");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getEmail();
        partner3.login("", "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25341");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.logout();
        partner3.login("partner", "hi!");
        java.lang.String str13 = partner3.getID();
        partner3.logout();
        partner3.setVerified(true);
        double double17 = partner3.getHourlyRate();
        double double18 = partner3.getHourlyRate();
        java.lang.String str19 = partner3.getEmail();
        boolean boolean20 = partner3.isVerified();
        java.lang.String str21 = partner3.getAccountType();
        java.lang.String str22 = partner3.getPassword();
        partner3.login("partner", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test25342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25342");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getEmail();
        partner3.logout();
        partner3.login("hi!", "hi!");
        boolean boolean13 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test25343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25343");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.viewProfile();
        boolean boolean12 = partner3.isVerified();
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getID();
        boolean boolean15 = partner3.isVerified();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str19 = partner3.getEmail();
        partner3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test25344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25344");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getAccountType();
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getID();
        boolean boolean15 = partner3.isVerified();
        double double16 = partner3.getHourlyRate();
        partner3.viewProfile();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
    }

    @Test
    public void test25345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25345");
        model.Partner partner3 = new model.Partner("hi!", "", "partner");
        java.lang.String str4 = partner3.getPassword();
        partner3.logout();
        boolean boolean6 = partner3.isVerified();
        double double7 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
    }

    @Test
    public void test25346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25346");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        partner3.login("", "");
        java.lang.String str15 = partner3.getAccountType();
        partner3.logout();
        partner3.login("partner", "partner");
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
    }

    @Test
    public void test25347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25347");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        double double12 = partner3.getHourlyRate();
        partner3.logout();
        partner3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test25348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25348");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        double double14 = partner3.getHourlyRate();
        partner3.viewProfile();
        double double16 = partner3.getHourlyRate();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
    }

    @Test
    public void test25349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25349");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getPassword();
        partner3.login("", "");
        partner3.login("", "");
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test25350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25350");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        partner3.logout();
        double double11 = partner3.getHourlyRate();
        partner3.viewProfile();
        partner3.setVerified(false);
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getID();
        java.lang.String str17 = partner3.getEmail();
        java.lang.String str18 = partner3.getEmail();
        boolean boolean19 = partner3.isVerified();
        boolean boolean20 = partner3.isVerified();
        java.lang.String str21 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test25351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25351");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        java.lang.String str5 = partner3.getPassword();
        partner3.logout();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getID();
        partner3.viewProfile();
        partner3.setVerified(false);
        double double12 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test25352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25352");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        partner3.logout();
        double double9 = partner3.getHourlyRate();
        partner3.setVerified(true);
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getEmail();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25353");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        partner3.logout();
        boolean boolean13 = partner3.isVerified();
        boolean boolean14 = partner3.isVerified();
        java.lang.String str15 = partner3.getPassword();
        double double16 = partner3.getHourlyRate();
        java.lang.String str17 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str20 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test25354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25354");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str12 = partner3.getID();
        partner3.login("", "hi!");
        boolean boolean16 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str18 = partner3.getAccountType();
        java.lang.String str19 = partner3.getAccountType();
        partner3.setVerified(false);
        java.lang.String str22 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass23 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "partner" + "'", str22, "partner");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test25355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25355");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        partner3.login("partner", "partner");
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getPassword();
        partner3.login("partner", "partner");
        java.lang.String str16 = partner3.getPassword();
        java.lang.String str17 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test25356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25356");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getAccountType();
        boolean boolean14 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25357");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getID();
        partner3.viewProfile();
        boolean boolean13 = partner3.isVerified();
        partner3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test25358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25358");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("", "hi!");
        java.lang.String str11 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25359");
        model.Partner partner3 = new model.Partner("partner", "hi!", "");
        partner3.login("hi!", "hi!");
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test25360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25360");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.login("", "partner");
        double double9 = partner3.getHourlyRate();
        partner3.login("hi!", "");
        java.lang.String str13 = partner3.getPassword();
        partner3.logout();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25361");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getID();
        partner3.login("hi!", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25362");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.viewProfile();
        partner3.login("", "partner");
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getEmail();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test25363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25363");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getPassword();
        double double5 = partner3.getHourlyRate();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getAccountType();
        partner3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
    }

    @Test
    public void test25364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25364");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.login("", "hi!");
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test25365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25365");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        double double4 = partner3.getHourlyRate();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test25366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25366");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str16 = partner3.getPassword();
        partner3.logout();
        partner3.login("", "");
        java.lang.String str21 = partner3.getAccountType();
        java.lang.String str22 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "partner" + "'", str22, "partner");
    }

    @Test
    public void test25367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25367");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        boolean boolean14 = partner3.isVerified();
        double double15 = partner3.getHourlyRate();
        partner3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test25368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25368");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25369");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getID();
        partner3.login("hi!", "hi!");
        java.lang.String str17 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.String str20 = partner3.getAccountType();
        java.lang.String str21 = partner3.getPassword();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test25370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25370");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getPassword();
        double double11 = partner3.getHourlyRate();
        partner3.setVerified(false);
        partner3.setVerified(true);
        partner3.login("hi!", "");
        partner3.login("hi!", "");
        partner3.setVerified(false);
        java.lang.String str24 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test25371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25371");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getPassword();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getEmail();
        partner3.login("partner", "");
        java.lang.String str18 = partner3.getPassword();
        java.lang.String str19 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
    }

    @Test
    public void test25372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25372");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.logout();
        partner3.login("partner", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test25373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25373");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str11 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.viewProfile();
        boolean boolean14 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test25374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25374");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.login("", "hi!");
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test25375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25375");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getAccountType();
        partner3.setVerified(false);
        java.lang.String str19 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test25376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25376");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.login("", "hi!");
        java.lang.String str11 = partner3.getEmail();
        partner3.login("", "hi!");
        partner3.logout();
        boolean boolean16 = partner3.isVerified();
        java.lang.String str17 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test25377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25377");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25378");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        double double13 = partner3.getHourlyRate();
        boolean boolean14 = partner3.isVerified();
        partner3.viewProfile();
        partner3.login("", "partner");
        partner3.login("", "hi!");
        java.lang.String str22 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "partner" + "'", str22, "partner");
    }

    @Test
    public void test25379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25379");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        boolean boolean10 = partner3.isVerified();
        partner3.logout();
        java.lang.String str12 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test25380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25380");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getID();
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getPassword();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25381");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getAccountType();
        partner3.viewProfile();
        boolean boolean14 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25382");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        partner3.viewProfile();
        double double13 = partner3.getHourlyRate();
        partner3.login("", "");
        partner3.viewProfile();
        partner3.setVerified(true);
        partner3.viewProfile();
        partner3.login("partner", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test25383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25383");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str14 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25384");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        partner3.setVerified(true);
        partner3.viewProfile();
        java.lang.String str14 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str16 = partner3.getID();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test25385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25385");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getID();
        partner3.logout();
        java.lang.String str16 = partner3.getID();
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getEmail();
        double double20 = partner3.getHourlyRate();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass23 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test25386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25386");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getID();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getEmail();
        java.lang.String str17 = partner3.getEmail();
        java.lang.String str18 = partner3.getPassword();
        java.lang.String str19 = partner3.getEmail();
        double double20 = partner3.getHourlyRate();
        partner3.setVerified(false);
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
    }

    @Test
    public void test25387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25387");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("partner", "hi!");
        partner3.login("hi!", "");
        partner3.login("partner", "");
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getID();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test25388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25388");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getEmail();
        partner3.login("", "partner");
        partner3.setVerified(false);
        partner3.login("", "");
        java.lang.String str19 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
    }

    @Test
    public void test25389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25389");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        double double9 = partner3.getHourlyRate();
        double double10 = partner3.getHourlyRate();
        partner3.login("", "hi!");
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test25390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25390");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getAccountType();
        double double13 = partner3.getHourlyRate();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test25391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25391");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getPassword();
        partner3.setVerified(true);
        double double18 = partner3.getHourlyRate();
        java.lang.String str19 = partner3.getPassword();
        partner3.logout();
        double double21 = partner3.getHourlyRate();
        partner3.login("", "");
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
    }

    @Test
    public void test25392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25392");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test25393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25393");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getID();
        partner3.login("hi!", "hi!");
        java.lang.String str17 = partner3.getID();
        boolean boolean18 = partner3.isVerified();
        boolean boolean19 = partner3.isVerified();
        double double20 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
    }

    @Test
    public void test25394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25394");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        partner3.logout();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        partner3.login("", "hi!");
        java.lang.String str15 = partner3.getPassword();
        partner3.setVerified(true);
        boolean boolean18 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test25395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25395");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getPassword();
        boolean boolean11 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test25396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25396");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        partner3.viewProfile();
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getEmail();
        double double15 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str17 = partner3.getAccountType();
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test25397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25397");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getPassword();
        partner3.logout();
        partner3.setVerified(false);
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25398");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.logout();
        partner3.setVerified(true);
        partner3.setVerified(false);
        partner3.logout();
        partner3.viewProfile();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getPassword();
        partner3.logout();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test25399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25399");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.logout();
        java.lang.String str10 = partner3.getID();
        partner3.login("partner", "");
        partner3.setVerified(false);
        java.lang.String str16 = partner3.getPassword();
        java.lang.String str17 = partner3.getEmail();
        boolean boolean18 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test25400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25400");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getID();
        partner3.login("", "");
        java.lang.String str12 = partner3.getID();
        partner3.logout();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.logout();
        java.lang.String str19 = partner3.getEmail();
        java.lang.String str20 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test25401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25401");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.login("", "");
        java.lang.String str16 = partner3.getID();
        java.lang.String str17 = partner3.getEmail();
        boolean boolean18 = partner3.isVerified();
        partner3.login("", "");
        boolean boolean22 = partner3.isVerified();
        java.lang.String str23 = partner3.getPassword();
        boolean boolean24 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test25402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25402");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        double double8 = partner3.getHourlyRate();
        partner3.login("", "");
        partner3.logout();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25403");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        partner3.login("", "");
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getAccountType();
        partner3.setVerified(false);
        boolean boolean19 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test25404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25404");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getID();
        partner3.logout();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test25405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25405");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getEmail();
        partner3.logout();
        boolean boolean14 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25406");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        double double10 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }

    @Test
    public void test25407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25407");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.setVerified(true);
        partner3.setVerified(true);
        java.lang.String str8 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getEmail();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test25408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25408");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getPassword();
        partner3.logout();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        boolean boolean8 = partner3.isVerified();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test25409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25409");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getEmail();
        partner3.logout();
        partner3.login("partner", "");
        double double13 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        partner3.logout();
        java.lang.String str18 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25410");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str13 = partner3.getID();
        double double14 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str16 = partner3.getID();
        double double17 = partner3.getHourlyRate();
        java.lang.String str18 = partner3.getEmail();
        java.lang.String str19 = partner3.getPassword();
        partner3.login("partner", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test25411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25411");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getPassword();
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getPassword();
        boolean boolean15 = partner3.isVerified();
        partner3.viewProfile();
        boolean boolean17 = partner3.isVerified();
        double double18 = partner3.getHourlyRate();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
    }

    @Test
    public void test25412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25412");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.logout();
        java.lang.String str13 = partner3.getID();
        boolean boolean14 = partner3.isVerified();
        java.lang.String str15 = partner3.getID();
        boolean boolean16 = partner3.isVerified();
        java.lang.String str17 = partner3.getPassword();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test25413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25413");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        boolean boolean13 = partner3.isVerified();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str17 = partner3.getAccountType();
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getAccountType();
        java.lang.String str20 = partner3.getPassword();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test25414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25414");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.setVerified(false);
        partner3.login("", "");
        partner3.viewProfile();
        double double14 = partner3.getHourlyRate();
        double double15 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test25415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25415");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        boolean boolean11 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(true);
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test25416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25416");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.setVerified(true);
        partner3.login("partner", "hi!");
        java.lang.String str9 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test25417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25417");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean15 = partner3.isVerified();
        partner3.login("", "hi!");
        java.lang.String str19 = partner3.getAccountType();
        boolean boolean20 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test25418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25418");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getID();
        partner3.login("", "partner");
        partner3.setVerified(false);
        partner3.setVerified(false);
        boolean boolean19 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test25419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25419");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str14 = partner3.getID();
        partner3.login("", "partner");
        boolean boolean18 = partner3.isVerified();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test25420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25420");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getAccountType();
        partner3.login("partner", "partner");
        java.lang.String str10 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test25421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25421");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getEmail();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25422");
        model.Partner partner3 = new model.Partner("partner", "", "partner");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }

    @Test
    public void test25423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25423");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        boolean boolean10 = partner3.isVerified();
        boolean boolean11 = partner3.isVerified();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getPassword();
        partner3.logout();
        partner3.login("", "partner");
        java.lang.String str18 = partner3.getPassword();
        java.lang.String str19 = partner3.getID();
        partner3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test25424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25424");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.logout();
        partner3.logout();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25425");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        partner3.viewProfile();
        partner3.viewProfile();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        partner3.setVerified(true);
        java.lang.String str12 = partner3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25426");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        partner3.login("", "");
        java.lang.String str15 = partner3.getPassword();
        double double16 = partner3.getHourlyRate();
        double double17 = partner3.getHourlyRate();
        boolean boolean18 = partner3.isVerified();
        java.lang.String str19 = partner3.getEmail();
        java.lang.String str20 = partner3.getPassword();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test25427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25427");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.login("", "");
        partner3.viewProfile();
        java.lang.String str15 = partner3.getEmail();
        partner3.login("", "hi!");
        java.lang.String str19 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
    }

    @Test
    public void test25428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25428");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.setVerified(true);
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getEmail();
        partner3.login("", "partner");
        partner3.viewProfile();
        java.lang.String str21 = partner3.getID();
        double double22 = partner3.getHourlyRate();
        partner3.setVerified(true);
        partner3.logout();
        java.lang.String str26 = partner3.getEmail();
        java.lang.String str27 = partner3.getID();
        java.lang.Class<?> wildcardClass28 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test25429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25429");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getEmail();
        partner3.setVerified(true);
        boolean boolean15 = partner3.isVerified();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test25430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25430");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str17 = partner3.getPassword();
        java.lang.String str18 = partner3.getEmail();
        java.lang.String str19 = partner3.getEmail();
        java.lang.String str20 = partner3.getID();
        partner3.login("hi!", "partner");
        partner3.logout();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test25431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25431");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.String str16 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25432");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getID();
        boolean boolean8 = partner3.isVerified();
        partner3.setVerified(true);
        partner3.setVerified(true);
        partner3.viewProfile();
        boolean boolean14 = partner3.isVerified();
        partner3.logout();
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test25433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25433");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str13 = partner3.getAccountType();
        partner3.viewProfile();
        boolean boolean15 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str17 = partner3.getPassword();
        java.lang.String str18 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25434");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getAccountType();
        partner3.login("hi!", "partner");
        java.lang.String str12 = partner3.getID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test25435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25435");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        partner3.viewProfile();
        double double13 = partner3.getHourlyRate();
        partner3.login("", "");
        java.lang.String str17 = partner3.getEmail();
        partner3.viewProfile();
        boolean boolean19 = partner3.isVerified();
        partner3.viewProfile();
        boolean boolean21 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25436");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str6 = partner3.getID();
        double double7 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
    }

    @Test
    public void test25437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25437");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.login("", "partner");
        double double9 = partner3.getHourlyRate();
        partner3.login("hi!", "");
        partner3.logout();
        partner3.logout();
        double double15 = partner3.getHourlyRate();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test25438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25438");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getPassword();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getEmail();
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test25439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25439");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getPassword();
        partner3.login("hi!", "");
        partner3.setVerified(true);
        double double15 = partner3.getHourlyRate();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test25440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25440");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "");
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getPassword();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test25441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25441");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        partner3.login("partner", "partner");
        java.lang.String str13 = partner3.getPassword();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test25442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25442");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.login("hi!", "");
        partner3.logout();
        double double14 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str16 = partner3.getAccountType();
        partner3.logout();
        boolean boolean18 = partner3.isVerified();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test25443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25443");
        model.Partner partner3 = new model.Partner("", "hi!", "hi!");
        partner3.login("partner", "partner");
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getAccountType();
        partner3.setVerified(false);
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test25444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25444");
        model.Partner partner3 = new model.Partner("partner", "hi!", "");
        partner3.viewProfile();
        java.lang.String str5 = partner3.getPassword();
        partner3.setVerified(true);
        double double8 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
    }

    @Test
    public void test25445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25445");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        partner3.setVerified(true);
        partner3.login("partner", "hi!");
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test25446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25446");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        double double9 = partner3.getHourlyRate();
        partner3.setVerified(true);
        partner3.viewProfile();
        partner3.login("", "partner");
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test25447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25447");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        boolean boolean16 = partner3.isVerified();
        partner3.logout();
        java.lang.String str18 = partner3.getPassword();
        java.lang.String str19 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
    }

    @Test
    public void test25448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25448");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(true);
        double double11 = partner3.getHourlyRate();
        partner3.login("hi!", "hi!");
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getPassword();
        partner3.login("partner", "partner");
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test25449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25449");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        partner3.login("", "hi!");
        boolean boolean14 = partner3.isVerified();
        partner3.login("", "hi!");
        java.lang.String str18 = partner3.getAccountType();
        java.lang.String str19 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(true);
        partner3.viewProfile();
        partner3.login("partner", "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test25450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25450");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test25451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25451");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getPassword();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("hi!", "hi!");
        partner3.setVerified(false);
        partner3.setVerified(true);
        partner3.logout();
        java.lang.String str19 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test25452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25452");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.logout();
        partner3.login("partner", "hi!");
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getAccountType();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
    }

    @Test
    public void test25453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25453");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getPassword();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test25454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25454");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        partner3.setVerified(true);
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getEmail();
        java.lang.String str20 = partner3.getEmail();
        java.lang.String str21 = partner3.getAccountType();
        partner3.logout();
        partner3.setVerified(true);
        double double25 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 50.0d + "'", double25 == 50.0d);
    }

    @Test
    public void test25455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25455");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        partner3.login("", "partner");
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str17 = partner3.getEmail();
        partner3.viewProfile();
        double double19 = partner3.getHourlyRate();
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
    }

    @Test
    public void test25456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25456");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getAccountType();
        partner3.login("", "hi!");
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str21 = partner3.getAccountType();
        partner3.login("partner", "partner");
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
    }

    @Test
    public void test25457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25457");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getID();
        partner3.logout();
        java.lang.String str13 = partner3.getAccountType();
        double double14 = partner3.getHourlyRate();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test25458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25458");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getPassword();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getPassword();
        double double17 = partner3.getHourlyRate();
        java.lang.String str18 = partner3.getID();
        partner3.login("", "hi!");
        boolean boolean22 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test25459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25459");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        boolean boolean8 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str13 = partner3.getID();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getEmail();
        java.lang.String str17 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test25460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25460");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getEmail();
        boolean boolean16 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.String str19 = partner3.getPassword();
        boolean boolean20 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test25461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25461");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.logout();
        partner3.login("partner", "partner");
        java.lang.String str18 = partner3.getEmail();
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test25462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25462");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.login("", "partner");
        java.lang.String str17 = partner3.getEmail();
        partner3.login("", "hi!");
        java.lang.String str21 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
    }

    @Test
    public void test25463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25463");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        partner3.login("", "partner");
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getEmail();
        double double16 = partner3.getHourlyRate();
        java.lang.String str17 = partner3.getPassword();
        partner3.logout();
        partner3.login("hi!", "");
        java.lang.String str22 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test25464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25464");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        partner3.logout();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25465");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getPassword();
        partner3.viewProfile();
        double double11 = partner3.getHourlyRate();
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test25466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25466");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str11 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getPassword();
        partner3.viewProfile();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25467");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.logout();
        double double14 = partner3.getHourlyRate();
        double double15 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str17 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test25468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25468");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.logout();
        double double14 = partner3.getHourlyRate();
        partner3.login("partner", "hi!");
        java.lang.String str18 = partner3.getPassword();
        java.lang.String str19 = partner3.getID();
        double double20 = partner3.getHourlyRate();
        double double21 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
    }

    @Test
    public void test25469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25469");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str11 = partner3.getEmail();
        partner3.setVerified(false);
        boolean boolean14 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.String str17 = partner3.getAccountType();
        boolean boolean18 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test25470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25470");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getEmail();
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getPassword();
        java.lang.String str17 = partner3.getPassword();
        boolean boolean18 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.String str21 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
    }

    @Test
    public void test25471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25471");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "");
        boolean boolean12 = partner3.isVerified();
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getPassword();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getAccountType();
        partner3.setVerified(true);
        java.lang.String str19 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.logout();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
    }

    @Test
    public void test25472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25472");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "");
        boolean boolean12 = partner3.isVerified();
        partner3.viewProfile();
        partner3.login("", "hi!");
        partner3.setVerified(false);
        double double19 = partner3.getHourlyRate();
        java.lang.String str20 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test25473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25473");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        partner3.setVerified(true);
        partner3.setVerified(true);
        java.lang.String str14 = partner3.getEmail();
        partner3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25474");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getAccountType();
        partner3.login("", "hi!");
        java.lang.String str19 = partner3.getEmail();
        partner3.login("partner", "hi!");
        partner3.login("partner", "partner");
        boolean boolean26 = partner3.isVerified();
        partner3.logout();
        partner3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test25475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25475");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getPassword();
        java.lang.String str11 = partner3.getAccountType();
        partner3.login("partner", "hi!");
        java.lang.String str15 = partner3.getEmail();
        partner3.logout();
        boolean boolean17 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test25476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25476");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        partner3.logout();
        partner3.setVerified(false);
        partner3.login("", "");
        partner3.login("partner", "");
        partner3.setVerified(false);
        partner3.logout();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25477");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getID();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        boolean boolean13 = partner3.isVerified();
        partner3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test25478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25478");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        double double10 = partner3.getHourlyRate();
        boolean boolean11 = partner3.isVerified();
        boolean boolean12 = partner3.isVerified();
        boolean boolean13 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test25479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25479");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str15 = partner3.getAccountType();
        partner3.login("", "partner");
        partner3.login("partner", "partner");
        java.lang.String str22 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "partner" + "'", str22, "partner");
    }

    @Test
    public void test25480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25480");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str12 = partner3.getAccountType();
        partner3.login("hi!", "partner");
        partner3.viewProfile();
        double double17 = partner3.getHourlyRate();
        java.lang.String str18 = partner3.getPassword();
        double double19 = partner3.getHourlyRate();
        double double20 = partner3.getHourlyRate();
        double double21 = partner3.getHourlyRate();
        java.lang.String str22 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test25481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25481");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getEmail();
        partner3.viewProfile();
        partner3.login("hi!", "");
        java.lang.String str20 = partner3.getEmail();
        partner3.login("", "hi!");
        double double24 = partner3.getHourlyRate();
        java.lang.String str25 = partner3.getID();
        java.lang.String str26 = partner3.getPassword();
        java.lang.String str27 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.setVerified(false);
        java.lang.String str32 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 50.0d + "'", double24 == 50.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test25482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25482");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getEmail();
        boolean boolean11 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test25483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25483");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.logout();
        partner3.logout();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test25484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25484");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getID();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str16 = partner3.getID();
        double double17 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test25485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25485");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.logout();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getID();
        partner3.logout();
        java.lang.String str17 = partner3.getEmail();
        double double18 = partner3.getHourlyRate();
        partner3.setVerified(true);
        partner3.login("partner", "");
        java.lang.String str24 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test25486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25486");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getAccountType();
        partner3.login("", "hi!");
        partner3.viewProfile();
        java.lang.String str20 = partner3.getEmail();
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test25487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25487");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getPassword();
        partner3.setVerified(true);
        double double18 = partner3.getHourlyRate();
        java.lang.String str19 = partner3.getPassword();
        java.lang.String str20 = partner3.getID();
        partner3.login("partner", "hi!");
        java.lang.String str24 = partner3.getPassword();
        java.lang.String str25 = partner3.getAccountType();
        double double26 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "partner" + "'", str25, "partner");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 50.0d + "'", double26 == 50.0d);
    }

    @Test
    public void test25488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25488");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        partner3.setVerified(true);
        java.lang.String str18 = partner3.getAccountType();
        partner3.login("partner", "hi!");
        double double22 = partner3.getHourlyRate();
        java.lang.String str23 = partner3.getPassword();
        partner3.logout();
        partner3.setVerified(true);
        partner3.logout();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test25489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25489");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getID();
        double double12 = partner3.getHourlyRate();
        partner3.viewProfile();
        partner3.login("hi!", "hi!");
        partner3.setVerified(true);
        java.lang.String str19 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test25490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25490");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getID();
        partner3.setVerified(false);
        double double13 = partner3.getHourlyRate();
        partner3.viewProfile();
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getAccountType();
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getPassword();
        boolean boolean19 = partner3.isVerified();
        double double20 = partner3.getHourlyRate();
        boolean boolean21 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test25491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25491");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getPassword();
        partner3.viewProfile();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25492");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "");
        boolean boolean12 = partner3.isVerified();
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.login("partner", "hi!");
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str23 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test25493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25493");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str12 = partner3.getAccountType();
        partner3.logout();
        partner3.logout();
        partner3.logout();
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test25494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25494");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test25495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25495");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getAccountType();
        boolean boolean9 = partner3.isVerified();
        partner3.logout();
        java.lang.String str11 = partner3.getID();
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25496");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str12 = partner3.getAccountType();
        partner3.login("hi!", "partner");
        double double16 = partner3.getHourlyRate();
        java.lang.String str17 = partner3.getID();
        boolean boolean18 = partner3.isVerified();
        java.lang.String str19 = partner3.getPassword();
        boolean boolean20 = partner3.isVerified();
        boolean boolean21 = partner3.isVerified();
        partner3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test25497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25497");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getPassword();
        partner3.logout();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str17 = partner3.getID();
        partner3.login("partner", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test25498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25498");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getAccountType();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25499");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        double double5 = partner3.getHourlyRate();
        partner3.login("", "partner");
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test25500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25500");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.viewProfile();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.viewProfile();
        double double12 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str14 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }
}

