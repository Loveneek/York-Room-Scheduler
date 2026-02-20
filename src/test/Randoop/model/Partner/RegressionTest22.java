import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

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
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.login("", "");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
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
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getID();
        partner3.viewProfile();
        boolean boolean18 = partner3.isVerified();
        java.lang.String str19 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        model.Partner partner3 = new model.Partner("partner", "", "partner");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getID();
        boolean boolean10 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        partner3.login("hi!", "hi!");
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getID();
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getID();
        boolean boolean9 = partner3.isVerified();
        boolean boolean10 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getPassword();
        double double16 = partner3.getHourlyRate();
        java.lang.String str17 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
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
        partner3.setVerified(true);
        java.lang.String str21 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getID();
        partner3.logout();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str19 = partner3.getID();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getID();
        partner3.login("hi!", "partner");
        partner3.logout();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getEmail();
        partner3.login("", "partner");
        partner3.login("partner", "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        model.Partner partner3 = new model.Partner("partner", "hi!", "");
        partner3.login("hi!", "hi!");
        partner3.logout();
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.logout();
        partner3.login("partner", "hi!");
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str11 = partner3.getEmail();
        partner3.login("partner", "hi!");
        java.lang.String str15 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        boolean boolean19 = partner3.isVerified();
        java.lang.String str20 = partner3.getID();
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        boolean boolean13 = partner3.isVerified();
        partner3.setVerified(true);
        partner3.setVerified(true);
        double double18 = partner3.getHourlyRate();
        java.lang.String str19 = partner3.getEmail();
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getID();
        partner3.login("hi!", "partner");
        partner3.logout();
        partner3.logout();
        java.lang.String str16 = partner3.getPassword();
        partner3.setVerified(false);
        boolean boolean19 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.viewProfile();
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getID();
        boolean boolean14 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getPassword();
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.setVerified(true);
        partner3.login("hi!", "");
        java.lang.String str12 = partner3.getPassword();
        partner3.login("hi!", "");
        boolean boolean16 = partner3.isVerified();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
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
        java.lang.String str18 = partner3.getEmail();
        double double19 = partner3.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        partner3.logout();
        boolean boolean11 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str13 = partner3.getPassword();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getEmail();
        partner3.logout();
        partner3.logout();
        partner3.login("hi!", "");
        partner3.logout();
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "");
        java.lang.String str12 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str14 = partner3.getAccountType();
        partner3.login("partner", "");
        java.lang.String str18 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str20 = partner3.getEmail();
        boolean boolean21 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
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
        boolean boolean22 = partner3.isVerified();
        java.lang.String str23 = partner3.getPassword();
        boolean boolean24 = partner3.isVerified();
        partner3.login("partner", "");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
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
        java.lang.String str18 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        model.Partner partner3 = new model.Partner("", "partner", "");
        java.lang.String str4 = partner3.getPassword();
        java.lang.String str5 = partner3.getEmail();
        partner3.login("hi!", "hi!");
        partner3.logout();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getPassword();
        boolean boolean13 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.login("partner", "hi!");
        java.lang.String str10 = partner3.getPassword();
        java.lang.String str11 = partner3.getID();
        boolean boolean12 = partner3.isVerified();
        partner3.login("", "partner");
        java.lang.String str16 = partner3.getAccountType();
        java.lang.String str17 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        partner3.viewProfile();
        partner3.login("hi!", "hi!");
        partner3.logout();
        partner3.logout();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getEmail();
        boolean boolean8 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
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
        java.lang.String str15 = partner3.getEmail();
        partner3.login("", "");
        boolean boolean19 = partner3.isVerified();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("", "partner");
        java.lang.String str11 = partner3.getPassword();
        partner3.logout();
        double double13 = partner3.getHourlyRate();
        partner3.login("hi!", "");
        boolean boolean17 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
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
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getEmail();
        java.lang.String str17 = partner3.getAccountType();
        java.lang.String str18 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
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
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getEmail();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
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
        double double19 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
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
        java.lang.String str16 = partner3.getEmail();
        java.lang.String str17 = partner3.getAccountType();
        partner3.viewProfile();
        double double19 = partner3.getHourlyRate();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        java.lang.String str10 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.login("partner", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        partner3.logout();
        boolean boolean9 = partner3.isVerified();
        boolean boolean10 = partner3.isVerified();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
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
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str19 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str22 = partner3.getID();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getEmail();
        partner3.viewProfile();
        boolean boolean9 = partner3.isVerified();
        double double10 = partner3.getHourlyRate();
        partner3.viewProfile();
        boolean boolean12 = partner3.isVerified();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        partner3.setVerified(true);
        partner3.setVerified(true);
        boolean boolean17 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str21 = partner3.getAccountType();
        partner3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getPassword();
        partner3.logout();
        partner3.login("partner", "partner");
        partner3.login("partner", "");
        boolean boolean19 = partner3.isVerified();
        partner3.logout();
        java.lang.String str21 = partner3.getEmail();
        java.lang.String str22 = partner3.getID();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str26 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        java.lang.String str11 = partner3.getPassword();
        partner3.logout();
        boolean boolean13 = partner3.isVerified();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getPassword();
        partner3.setVerified(false);
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        partner3.logout();
        partner3.login("partner", "hi!");
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
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
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getEmail();
        partner3.login("partner", "");
        java.lang.String str22 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        java.lang.String str8 = partner3.getID();
        boolean boolean9 = partner3.isVerified();
        boolean boolean10 = partner3.isVerified();
        partner3.logout();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getEmail();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getEmail();
        boolean boolean12 = partner3.isVerified();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        boolean boolean11 = partner3.isVerified();
        double double12 = partner3.getHourlyRate();
        boolean boolean13 = partner3.isVerified();
        partner3.logout();
        partner3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.setVerified(true);
        partner3.logout();
        java.lang.String str7 = partner3.getEmail();
        partner3.login("hi!", "hi!");
        boolean boolean11 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getEmail();
        double double10 = partner3.getHourlyRate();
        partner3.setVerified(true);
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        java.lang.String str8 = partner3.getID();
        boolean boolean9 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.String str12 = partner3.getPassword();
        boolean boolean13 = partner3.isVerified();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        model.Partner partner3 = new model.Partner("", "hi!", "");
        partner3.login("hi!", "hi!");
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("hi!", "partner");
        boolean boolean12 = partner3.isVerified();
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        model.Partner partner3 = new model.Partner("", "partner", "");
        java.lang.String str4 = partner3.getPassword();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.login("", "hi!");
        java.lang.String str10 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        partner3.viewProfile();
        partner3.login("hi!", "partner");
        partner3.viewProfile();
        java.lang.String str12 = partner3.getEmail();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
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
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        double double7 = partner3.getHourlyRate();
        partner3.login("partner", "hi!");
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getPassword();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
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
        partner3.setVerified(true);
        partner3.logout();
        partner3.viewProfile();
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
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.viewProfile();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getEmail();
        partner3.login("", "hi!");
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getEmail();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getPassword();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getEmail();
        double double11 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
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
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getID();
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getAccountType();
        partner3.viewProfile();
        double double20 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.login("hi!", "partner");
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        double double7 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str9 = partner3.getPassword();
        partner3.logout();
        partner3.login("partner", "");
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getPassword();
        partner3.login("", "");
        partner3.login("hi!", "hi!");
        java.lang.String str12 = partner3.getID();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.login("", "partner");
        double double9 = partner3.getHourlyRate();
        partner3.login("hi!", "");
        java.lang.String str13 = partner3.getPassword();
        partner3.logout();
        java.lang.String str15 = partner3.getAccountType();
        partner3.setVerified(false);
        java.lang.String str18 = partner3.getEmail();
        java.lang.String str19 = partner3.getPassword();
        java.lang.String str20 = partner3.getPassword();
        java.lang.String str21 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        partner3.logout();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.login("hi!", "");
        java.lang.String str18 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
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
        partner3.login("", "hi!");
        partner3.setVerified(true);
        java.lang.String str22 = partner3.getID();
        boolean boolean23 = partner3.isVerified();
        boolean boolean24 = partner3.isVerified();
        java.lang.String str25 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.login("partner", "hi!");
        partner3.logout();
        java.lang.String str13 = partner3.getEmail();
        partner3.setVerified(false);
        double double16 = partner3.getHourlyRate();
        partner3.login("partner", "hi!");
        double double20 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        partner3.logout();
        partner3.login("partner", "hi!");
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getEmail();
        partner3.login("hi!", "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
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
        double double18 = partner3.getHourlyRate();
        boolean boolean19 = partner3.isVerified();
        partner3.setVerified(true);
        partner3.setVerified(true);
        java.lang.String str24 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getAccountType();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getID();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.viewProfile();
        partner3.setVerified(true);
        double double9 = partner3.getHourlyRate();
        java.lang.String str10 = partner3.getPassword();
        java.lang.String str11 = partner3.getEmail();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "hi!");
        partner3.login("partner", "hi!");
        partner3.login("partner", "");
        partner3.viewProfile();
        java.lang.String str17 = partner3.getAccountType();
        partner3.logout();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        partner3.login("", "");
        double double15 = partner3.getHourlyRate();
        boolean boolean16 = partner3.isVerified();
        partner3.logout();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
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
        double double16 = partner3.getHourlyRate();
        partner3.setVerified(false);
        java.lang.String str19 = partner3.getID();
        partner3.setVerified(false);
        double double22 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str24 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.login("", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getID();
        partner3.login("hi!", "partner");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str17 = partner3.getEmail();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
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
        partner3.viewProfile();
        boolean boolean19 = partner3.isVerified();
        java.lang.String str20 = partner3.getPassword();
        java.lang.String str21 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
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
        double double17 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("", "partner");
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getAccountType();
        partner3.logout();
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.viewProfile();
        boolean boolean13 = partner3.isVerified();
        boolean boolean14 = partner3.isVerified();
        double double15 = partner3.getHourlyRate();
        double double16 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str18 = partner3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        partner3.login("partner", "");
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        boolean boolean8 = partner3.isVerified();
        partner3.login("hi!", "partner");
        partner3.logout();
        partner3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        boolean boolean6 = partner3.isVerified();
        partner3.login("partner", "");
        java.lang.String str10 = partner3.getEmail();
        partner3.login("hi!", "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.login("partner", "hi!");
        java.lang.String str12 = partner3.getAccountType();
        double double13 = partner3.getHourlyRate();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getPassword();
        double double17 = partner3.getHourlyRate();
        java.lang.String str18 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        partner3.logout();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getID();
        partner3.setVerified(true);
        partner3.logout();
        double double17 = partner3.getHourlyRate();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        partner3.login("", "hi!");
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getAccountType();
        partner3.viewProfile();
        double double17 = partner3.getHourlyRate();
        java.lang.String str18 = partner3.getAccountType();
        java.lang.String str19 = partner3.getEmail();
        java.lang.String str20 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        partner3.setVerified(false);
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
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
        java.lang.String str14 = partner3.getEmail();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
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
        double double15 = partner3.getHourlyRate();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str20 = partner3.getPassword();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
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
        partner3.login("", "hi!");
        java.lang.String str17 = partner3.getEmail();
        partner3.login("partner", "hi!");
        partner3.setVerified(true);
        partner3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        model.Partner partner3 = new model.Partner("", "", "");
        partner3.viewProfile();
        double double5 = partner3.getHourlyRate();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getAccountType();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
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
        java.lang.String str14 = partner3.getID();
        partner3.logout();
        java.lang.String str16 = partner3.getID();
        java.lang.String str17 = partner3.getID();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getPassword();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str10 = partner3.getAccountType();
        double double11 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        model.Partner partner3 = new model.Partner("hi!", "", "partner");
        java.lang.String str4 = partner3.getPassword();
        double double5 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str7 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
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
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getAccountType();
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getEmail();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getID();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
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
        partner3.setVerified(true);
        partner3.setVerified(true);
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
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
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
        partner3.logout();
        partner3.logout();
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getEmail();
        partner3.logout();
        java.lang.String str14 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean17 = partner3.isVerified();
        boolean boolean18 = partner3.isVerified();
        boolean boolean19 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        partner3.login("", "");
        double double15 = partner3.getHourlyRate();
        boolean boolean16 = partner3.isVerified();
        boolean boolean17 = partner3.isVerified();
        partner3.logout();
        double double19 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("partner", "partner");
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str16 = partner3.getID();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        partner3.viewProfile();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        java.lang.String str4 = partner3.getEmail();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        double double8 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        partner3.logout();
        partner3.login("hi!", "partner");
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.login("hi!", "");
        partner3.logout();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("", "hi!");
        partner3.login("", "partner");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        double double9 = partner3.getHourlyRate();
        double double10 = partner3.getHourlyRate();
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.login("partner", "");
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.login("", "partner");
        double double9 = partner3.getHourlyRate();
        java.lang.String str10 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
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
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getPassword();
        double double16 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getEmail();
        partner3.setVerified(true);
        boolean boolean12 = partner3.isVerified();
        partner3.logout();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getID();
        partner3.logout();
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getEmail();
        java.lang.String str17 = partner3.getEmail();
        partner3.viewProfile();
        partner3.login("hi!", "");
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str12 = partner3.getID();
        partner3.login("", "partner");
        partner3.login("", "");
        partner3.login("hi!", "partner");
        partner3.viewProfile();
        java.lang.String str23 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getID();
        boolean boolean12 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str16 = partner3.getPassword();
        boolean boolean17 = partner3.isVerified();
        boolean boolean18 = partner3.isVerified();
        partner3.viewProfile();
        partner3.setVerified(true);
        boolean boolean22 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getPassword();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getID();
        double double5 = partner3.getHourlyRate();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getID();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
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
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("", "partner");
        boolean boolean22 = partner3.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        partner3.setVerified(true);
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getEmail();
        double double14 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getPassword();
        partner3.setVerified(false);
        double double11 = partner3.getHourlyRate();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getEmail();
        partner3.login("", "partner");
        partner3.logout();
        boolean boolean19 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.setVerified(false);
        boolean boolean10 = partner3.isVerified();
        partner3.logout();
        java.lang.String str12 = partner3.getID();
        partner3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        partner3.login("", "hi!");
        partner3.viewProfile();
        java.lang.String str15 = partner3.getPassword();
        partner3.logout();
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getEmail();
        java.lang.String str19 = partner3.getID();
        java.lang.String str20 = partner3.getID();
        java.lang.String str21 = partner3.getEmail();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getPassword();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getAccountType();
        boolean boolean13 = partner3.isVerified();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
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
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getEmail();
        java.lang.String str17 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "");
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getEmail();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
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
        java.lang.String str25 = partner3.getID();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getPassword();
        partner3.logout();
        partner3.login("partner", "partner");
        partner3.login("partner", "");
        boolean boolean19 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        partner3.login("hi!", "");
        double double26 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 50.0d + "'", double26 == 50.0d);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        partner3.setVerified(false);
        java.lang.String str14 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getID();
        partner3.logout();
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getPassword();
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        double double13 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str15 = partner3.getAccountType();
        partner3.logout();
        partner3.setVerified(true);
        partner3.login("partner", "");
        java.lang.String str22 = partner3.getEmail();
        boolean boolean23 = partner3.isVerified();
        java.lang.String str24 = partner3.getID();
        boolean boolean25 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.logout();
        partner3.logout();
        partner3.logout();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "");
        boolean boolean12 = partner3.isVerified();
        boolean boolean13 = partner3.isVerified();
        partner3.setVerified(true);
        partner3.setVerified(false);
        java.lang.String str18 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
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
        java.lang.String str21 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass22 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        model.Partner partner3 = new model.Partner("partner", "hi!", "hi!");
        partner3.logout();
        partner3.logout();
        boolean boolean6 = partner3.isVerified();
        java.lang.String str7 = partner3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
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
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        model.Partner partner3 = new model.Partner("", "partner", "");
        java.lang.String str4 = partner3.getPassword();
        java.lang.String str5 = partner3.getEmail();
        partner3.logout();
        partner3.login("partner", "");
        java.lang.String str10 = partner3.getEmail();
        partner3.viewProfile();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getPassword();
        partner3.login("hi!", "partner");
        double double14 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        partner3.logout();
        double double9 = partner3.getHourlyRate();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getEmail();
        partner3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getEmail();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getID();
        boolean boolean12 = partner3.isVerified();
        boolean boolean13 = partner3.isVerified();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        partner3.login("", "hi!");
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        partner3.login("hi!", "hi!");
        boolean boolean14 = partner3.isVerified();
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getEmail();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(false);
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getPassword();
        double double15 = partner3.getHourlyRate();
        partner3.logout();
        partner3.login("partner", "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        java.lang.String str4 = partner3.getEmail();
        java.lang.String str5 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        model.Partner partner3 = new model.Partner("", "hi!", "partner");
        boolean boolean4 = partner3.isVerified();
        boolean boolean5 = partner3.isVerified();
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "");
        boolean boolean12 = partner3.isVerified();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.logout();
        partner3.login("partner", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getID();
        partner3.setVerified(true);
        partner3.viewProfile();
        partner3.login("partner", "partner");
        double double17 = partner3.getHourlyRate();
        java.lang.String str18 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str11 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.login("", "hi!");
        partner3.viewProfile();
        double double20 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.viewProfile();
        boolean boolean13 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        java.lang.String str8 = partner3.getID();
        boolean boolean9 = partner3.isVerified();
        boolean boolean10 = partner3.isVerified();
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
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
        java.lang.String str14 = partner3.getEmail();
        partner3.logout();
        boolean boolean16 = partner3.isVerified();
        java.lang.String str17 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(true);
        partner3.login("hi!", "");
        java.lang.String str16 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str18 = partner3.getEmail();
        boolean boolean19 = partner3.isVerified();
        java.lang.String str20 = partner3.getAccountType();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getID();
        boolean boolean14 = partner3.isVerified();
        partner3.setVerified(true);
        double double17 = partner3.getHourlyRate();
        java.lang.String str18 = partner3.getEmail();
        java.lang.String str19 = partner3.getID();
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
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
        java.lang.String str20 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
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
        java.lang.String str23 = partner3.getAccountType();
        partner3.setVerified(true);
        double double26 = partner3.getHourlyRate();
        partner3.setVerified(true);
        boolean boolean29 = partner3.isVerified();
        java.lang.String str30 = partner3.getID();
        java.lang.String str31 = partner3.getID();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 50.0d + "'", double26 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str13 = partner3.getAccountType();
        partner3.login("partner", "partner");
        partner3.login("hi!", "");
        java.lang.String str20 = partner3.getPassword();
        partner3.login("", "");
        partner3.setVerified(false);
        java.lang.String str26 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
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
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getEmail();
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getID();
        boolean boolean19 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        model.Partner partner3 = new model.Partner("", "", "partner");
        partner3.login("partner", "");
        boolean boolean7 = partner3.isVerified();
        boolean boolean8 = partner3.isVerified();
        partner3.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
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
        boolean boolean19 = partner3.isVerified();
        java.lang.String str20 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str22 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
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
        partner3.login("", "");
        partner3.logout();
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str12 = partner3.getID();
        partner3.login("", "partner");
        partner3.login("", "");
        partner3.login("hi!", "partner");
        boolean boolean22 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.logout();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getID();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
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
        partner3.logout();
        java.lang.String str14 = partner3.getPassword();
        partner3.viewProfile();
        partner3.login("hi!", "");
        java.lang.String str19 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        partner3.setVerified(false);
        partner3.setVerified(true);
        partner3.login("hi!", "hi!");
        partner3.logout();
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
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
        partner3.logout();
        java.lang.String str24 = partner3.getEmail();
        partner3.setVerified(true);
        boolean boolean27 = partner3.isVerified();
        java.lang.String str28 = partner3.getEmail();
        java.lang.String str29 = partner3.getEmail();
        java.lang.String str30 = partner3.getPassword();
        java.lang.String str31 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getID();
        double double15 = partner3.getHourlyRate();
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
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
        java.lang.String str16 = partner3.getAccountType();
        partner3.setVerified(false);
        double double19 = partner3.getHourlyRate();
        java.lang.String str20 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        double double12 = partner3.getHourlyRate();
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        partner3.login("partner", "partner");
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getPassword();
        partner3.login("hi!", "partner");
        boolean boolean18 = partner3.isVerified();
        java.lang.String str19 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str22 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getAccountType();
        partner3.login("hi!", "partner");
        partner3.setVerified(false);
        java.lang.String str20 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
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
        partner3.login("hi!", "");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        model.Partner partner3 = new model.Partner("partner", "", "partner");
        partner3.setVerified(true);
        partner3.logout();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getAccountType();
        partner3.setVerified(false);
        boolean boolean11 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
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
        double double16 = partner3.getHourlyRate();
        partner3.setVerified(true);
        java.lang.String str19 = partner3.getID();
        boolean boolean20 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getPassword();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
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
        double double17 = partner3.getHourlyRate();
        boolean boolean18 = partner3.isVerified();
        boolean boolean19 = partner3.isVerified();
        java.lang.String str20 = partner3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getEmail();
        partner3.login("", "partner");
        partner3.login("hi!", "partner");
        java.lang.String str22 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "partner" + "'", str22, "partner");
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.setVerified(false);
        boolean boolean10 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        java.lang.String str13 = partner3.getPassword();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        double double8 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        partner3.logout();
        java.lang.String str13 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str16 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        partner3.setVerified(true);
        partner3.setVerified(true);
        java.lang.String str12 = partner3.getPassword();
        partner3.login("hi!", "partner");
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
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
        double double16 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
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
        java.lang.String str14 = partner3.getEmail();
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getAccountType();
        java.lang.String str17 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(true);
        boolean boolean11 = partner3.isVerified();
        partner3.login("hi!", "partner");
        double double15 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str17 = partner3.getAccountType();
        partner3.login("partner", "");
        partner3.setVerified(false);
        partner3.login("hi!", "");
        java.lang.String str26 = partner3.getID();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getID();
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str20 = partner3.getID();
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getPassword();
        boolean boolean6 = partner3.isVerified();
        java.lang.String str7 = partner3.getEmail();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("partner", "hi!");
        partner3.logout();
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str16 = partner3.getPassword();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getEmail();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
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
        java.lang.String str16 = partner3.getEmail();
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getEmail();
        partner3.logout();
        partner3.login("hi!", "hi!");
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getPassword();
        partner3.viewProfile();
        partner3.login("partner", "partner");
        partner3.login("", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        partner3.viewProfile();
        partner3.login("hi!", "partner");
        partner3.viewProfile();
        partner3.login("", "");
        boolean boolean15 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.logout();
        partner3.setVerified(false);
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.logout();
        partner3.logout();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getEmail();
        partner3.login("", "hi!");
        java.lang.String str13 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getAccountType();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        double double8 = partner3.getHourlyRate();
        double double9 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        double double12 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
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
        partner3.setVerified(true);
        double double16 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str18 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getID();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
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
        boolean boolean14 = partner3.isVerified();
        double double15 = partner3.getHourlyRate();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        partner3.logout();
        partner3.logout();
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getPassword();
        partner3.logout();
        partner3.setVerified(true);
        partner3.login("hi!", "partner");
        java.lang.String str11 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
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
        java.lang.String str18 = partner3.getAccountType();
        java.lang.String str19 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getPassword();
        double double5 = partner3.getHourlyRate();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getEmail();
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.logout();
        partner3.logout();
        java.lang.String str13 = partner3.getPassword();
        partner3.setVerified(true);
        java.lang.String str16 = partner3.getPassword();
        java.lang.String str17 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
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
        double double16 = partner3.getHourlyRate();
        partner3.setVerified(false);
        boolean boolean19 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getID();
        boolean boolean15 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.setVerified(true);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        partner3.login("partner", "");
        java.lang.String str14 = partner3.getAccountType();
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getPassword();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getAccountType();
        double double15 = partner3.getHourlyRate();
        partner3.viewProfile();
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getAccountType();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getEmail();
        partner3.login("", "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getID();
        partner3.logout();
        java.lang.String str9 = partner3.getAccountType();
        boolean boolean10 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getEmail();
        partner3.login("partner", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        partner3.logout();
        java.lang.String str10 = partner3.getPassword();
        partner3.logout();
        partner3.login("partner", "hi!");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
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
        double double14 = partner3.getHourlyRate();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getAccountType();
        double double13 = partner3.getHourlyRate();
        partner3.logout();
        boolean boolean15 = partner3.isVerified();
        partner3.login("hi!", "partner");
        partner3.setVerified(true);
        java.lang.String str21 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
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
        java.lang.String str21 = partner3.getID();
        partner3.login("", "partner");
        boolean boolean25 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getEmail();
        partner3.login("partner", "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
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
        java.lang.String str21 = partner3.getEmail();
        boolean boolean22 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        boolean boolean8 = partner3.isVerified();
        partner3.logout();
        double double10 = partner3.getHourlyRate();
        partner3.logout();
        partner3.logout();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str16 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str18 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        partner3.logout();
        partner3.logout();
        partner3.login("hi!", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        double double7 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        partner3.login("", "");
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getAccountType();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        partner3.setVerified(true);
        partner3.setVerified(true);
        partner3.logout();
        boolean boolean13 = partner3.isVerified();
        partner3.logout();
        boolean boolean15 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getID();
        partner3.login("", "partner");
        partner3.logout();
        partner3.viewProfile();
        partner3.login("partner", "partner");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        double double6 = partner3.getHourlyRate();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getEmail();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        double double9 = partner3.getHourlyRate();
        partner3.setVerified(true);
        partner3.viewProfile();
        java.lang.String str13 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        partner3.setVerified(false);
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getID();
        partner3.logout();
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "hi!");
        partner3.login("partner", "hi!");
        partner3.login("partner", "");
        java.lang.String str16 = partner3.getAccountType();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
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
        partner3.logout();
        java.lang.String str24 = partner3.getEmail();
        partner3.setVerified(true);
        boolean boolean27 = partner3.isVerified();
        java.lang.String str28 = partner3.getEmail();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.login("", "");
        partner3.logout();
        java.lang.String str17 = partner3.getPassword();
        java.lang.String str18 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        partner3.login("hi!", "hi!");
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getID();
        double double16 = partner3.getHourlyRate();
        partner3.logout();
        partner3.login("", "");
        double double21 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
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
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getEmail();
        partner3.login("partner", "");
        partner3.logout();
        java.lang.String str23 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getPassword();
        double double5 = partner3.getHourlyRate();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.logout();
        boolean boolean9 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getID();
        double double9 = partner3.getHourlyRate();
        java.lang.String str10 = partner3.getID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getAccountType();
        partner3.logout();
        partner3.login("", "hi!");
        partner3.setVerified(true);
        double double18 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
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
        java.lang.String str17 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str19 = partner3.getEmail();
        java.lang.String str20 = partner3.getID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        double double9 = partner3.getHourlyRate();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getAccountType();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getPassword();
        boolean boolean14 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.String str17 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
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
        partner3.setVerified(false);
        partner3.login("hi!", "partner");
        double double20 = partner3.getHourlyRate();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        boolean boolean8 = partner3.isVerified();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getEmail();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getID();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getPassword();
        partner3.setVerified(false);
        double double18 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        partner3.viewProfile();
        partner3.login("", "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.logout();
        partner3.logout();
        partner3.login("hi!", "");
        partner3.login("hi!", "partner");
        java.lang.String str18 = partner3.getEmail();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
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
        double double18 = partner3.getHourlyRate();
        boolean boolean19 = partner3.isVerified();
        java.lang.String str20 = partner3.getEmail();
        double double21 = partner3.getHourlyRate();
        java.lang.String str22 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        partner3.login("", "");
        partner3.logout();
        partner3.logout();
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
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
        partner3.login("partner", "");
        partner3.setVerified(true);
        java.lang.String str18 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str21 = partner3.getEmail();
        partner3.logout();
        java.lang.String str23 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        model.Partner partner3 = new model.Partner("partner", "hi!", "partner");
        boolean boolean4 = partner3.isVerified();
        partner3.logout();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getPassword();
        java.lang.String str11 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getID();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str13 = partner3.getPassword();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getAccountType();
        partner3.logout();
        partner3.setVerified(false);
        boolean boolean16 = partner3.isVerified();
        boolean boolean17 = partner3.isVerified();
        partner3.login("hi!", "partner");
        partner3.setVerified(true);
        partner3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
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
        java.lang.String str13 = partner3.getPassword();
        partner3.setVerified(true);
        double double16 = partner3.getHourlyRate();
        double double17 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
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
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getID();
        partner3.login("partner", "");
        partner3.viewProfile();
        partner3.logout();
        double double21 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str23 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
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
        partner3.viewProfile();
        partner3.login("partner", "");
        partner3.login("partner", "hi!");
        partner3.login("partner", "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getEmail();
        partner3.login("partner", "partner");
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
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
        java.lang.String str16 = partner3.getID();
        java.lang.String str17 = partner3.getID();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
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
        partner3.logout();
        java.lang.String str20 = partner3.getID();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
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
        double double24 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 50.0d + "'", double24 == 50.0d);
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(true);
        double double11 = partner3.getHourlyRate();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getAccountType();
        partner3.login("hi!", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        boolean boolean9 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getPassword();
        double double14 = partner3.getHourlyRate();
        boolean boolean15 = partner3.isVerified();
        partner3.setVerified(false);
        boolean boolean18 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
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
        boolean boolean13 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
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
        java.lang.String str15 = partner3.getID();
        boolean boolean16 = partner3.isVerified();
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str19 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getEmail();
        double double13 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str16 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "hi!");
        partner3.logout();
        java.lang.String str11 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str14 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.login("", "hi!");
        java.lang.String str15 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
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
        double double21 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        partner3.logout();
        boolean boolean11 = partner3.isVerified();
        partner3.login("hi!", "hi!");
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.logout();
        partner3.login("partner", "partner");
        partner3.viewProfile();
        partner3.logout();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getPassword();
        partner3.logout();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        java.lang.String str4 = partner3.getEmail();
        double double5 = partner3.getHourlyRate();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getEmail();
        partner3.logout();
        java.lang.String str9 = partner3.getPassword();
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("", "");
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        double double7 = partner3.getHourlyRate();
        partner3.login("partner", "hi!");
        java.lang.String str11 = partner3.getID();
        partner3.logout();
        boolean boolean13 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str16 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        java.lang.String str4 = partner3.getEmail();
        double double5 = partner3.getHourlyRate();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
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
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getID();
        partner3.login("partner", "partner");
        java.lang.String str20 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        model.Partner partner3 = new model.Partner("partner", "hi!", "");
        partner3.login("hi!", "hi!");
        partner3.logout();
        partner3.setVerified(false);
        partner3.viewProfile();
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getID();
        partner3.logout();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean12 = partner3.isVerified();
        partner3.setVerified(true);
        partner3.setVerified(false);
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        double double7 = partner3.getHourlyRate();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        boolean boolean12 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        double double5 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getEmail();
        partner3.setVerified(true);
        double double12 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getEmail();
        double double9 = partner3.getHourlyRate();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getID();
        double double12 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        partner3.logout();
        java.lang.String str12 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getAccountType();
        partner3.logout();
        partner3.login("", "hi!");
        partner3.setVerified(true);
        double double18 = partner3.getHourlyRate();
        java.lang.String str19 = partner3.getID();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.login("", "");
        java.lang.String str17 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str13 = partner3.getEmail();
        boolean boolean14 = partner3.isVerified();
        partner3.login("hi!", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
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
        double double13 = partner3.getHourlyRate();
        partner3.login("hi!", "hi!");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        partner3.logout();
        boolean boolean12 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getEmail();
        partner3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getEmail();
        boolean boolean14 = partner3.isVerified();
        partner3.login("hi!", "hi!");
        partner3.setVerified(true);
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        boolean boolean9 = partner3.isVerified();
        boolean boolean10 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        java.lang.String str13 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getPassword();
        boolean boolean10 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.setVerified(true);
        partner3.logout();
        partner3.setVerified(true);
        double double9 = partner3.getHourlyRate();
        partner3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        boolean boolean11 = partner3.isVerified();
        boolean boolean12 = partner3.isVerified();
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getAccountType();
        partner3.login("hi!", "");
        partner3.logout();
        java.lang.String str19 = partner3.getEmail();
        partner3.login("", "");
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getPassword();
        partner3.login("", "hi!");
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getID();
        java.lang.String str17 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
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
        java.lang.String str14 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str16 = partner3.getID();
        java.lang.String str17 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
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
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getPassword();
        boolean boolean17 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getEmail();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(true);
        partner3.login("hi!", "");
        java.lang.String str16 = partner3.getAccountType();
        java.lang.String str17 = partner3.getEmail();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "partner");
        partner3.login("hi!", "partner");
        partner3.login("", "partner");
        java.lang.String str10 = partner3.getPassword();
        boolean boolean11 = partner3.isVerified();
        double double12 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
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
        java.lang.String str16 = partner3.getEmail();
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getPassword();
        java.lang.String str19 = partner3.getID();
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
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
        java.lang.String str17 = partner3.getAccountType();
        java.lang.String str18 = partner3.getAccountType();
        java.lang.String str19 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.login("hi!", "");
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str15 = partner3.getID();
        partner3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
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
        double double17 = partner3.getHourlyRate();
        partner3.login("hi!", "");
        java.lang.String str21 = partner3.getPassword();
        double double22 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.login("partner", "hi!");
        java.lang.String str12 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getPassword();
        java.lang.String str17 = partner3.getEmail();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getAccountType();
        boolean boolean10 = partner3.isVerified();
        boolean boolean11 = partner3.isVerified();
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getID();
        partner3.login("hi!", "partner");
        partner3.logout();
        partner3.login("", "hi!");
        java.lang.String str21 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
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
        java.lang.String str15 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str17 = partner3.getAccountType();
        partner3.logout();
        boolean boolean19 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
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
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getPassword();
        boolean boolean17 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str20 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.login("partner", "");
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getAccountType();
        partner3.logout();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str15 = partner3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
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
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getID();
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        model.Partner partner3 = new model.Partner("", "partner", "");
        java.lang.String str4 = partner3.getPassword();
        java.lang.String str5 = partner3.getEmail();
        partner3.logout();
        partner3.login("partner", "");
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getPassword();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
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
        partner3.setVerified(false);
        partner3.logout();
        partner3.logout();
        double double20 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str13 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        java.lang.String str4 = partner3.getEmail();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getAccountType();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getAccountType();
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getID();
        partner3.login("hi!", "partner");
        java.lang.String str16 = partner3.getPassword();
        partner3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.logout();
        partner3.setVerified(true);
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        partner3.login("partner", "");
        partner3.login("partner", "partner");
        java.lang.String str18 = partner3.getID();
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.setVerified(true);
        java.lang.String str6 = partner3.getPassword();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("", "partner");
        boolean boolean12 = partner3.isVerified();
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
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
        partner3.login("hi!", "partner");
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
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
        java.lang.String str17 = partner3.getID();
        partner3.setVerified(true);
        double double20 = partner3.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
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
        java.lang.String str19 = partner3.getEmail();
        partner3.viewProfile();
        double double21 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        partner3.logout();
        double double9 = partner3.getHourlyRate();
        partner3.setVerified(false);
        boolean boolean12 = partner3.isVerified();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("hi!", "partner");
        java.lang.String str12 = partner3.getID();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str16 = partner3.getPassword();
        double double17 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
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
        partner3.login("", "");
        java.lang.String str24 = partner3.getID();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
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
        partner3.logout();
        partner3.login("hi!", "partner");
        boolean boolean27 = partner3.isVerified();
        boolean boolean28 = partner3.isVerified();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str11 = partner3.getEmail();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        model.Partner partner3 = new model.Partner("", "partner", "");
        boolean boolean4 = partner3.isVerified();
        partner3.logout();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
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
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str19 = partner3.getAccountType();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getAccountType();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        java.lang.String str4 = partner3.getPassword();
        partner3.viewProfile();
        partner3.login("", "");
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getID();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
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
        java.lang.String str20 = partner3.getEmail();
        double double21 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        partner3.setVerified(false);
        partner3.login("", "");
        partner3.login("hi!", "");
        java.lang.String str15 = partner3.getID();
        partner3.logout();
        java.lang.String str17 = partner3.getID();
        double double18 = partner3.getHourlyRate();
        double double19 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(true);
        partner3.login("hi!", "");
        java.lang.String str16 = partner3.getAccountType();
        java.lang.String str17 = partner3.getEmail();
        java.lang.String str18 = partner3.getPassword();
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        partner3.login("partner", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.login("hi!", "");
        boolean boolean13 = partner3.isVerified();
        double double14 = partner3.getHourlyRate();
        partner3.viewProfile();
        double double16 = partner3.getHourlyRate();
        double double17 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        partner3.logout();
        partner3.login("", "hi!");
        boolean boolean16 = partner3.isVerified();
        partner3.logout();
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
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
        java.lang.String str16 = partner3.getAccountType();
        partner3.logout();
        double double18 = partner3.getHourlyRate();
        partner3.login("hi!", "partner");
        java.lang.String str22 = partner3.getID();
        java.lang.String str23 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("", "partner");
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
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
        partner3.login("", "");
        java.lang.String str22 = partner3.getAccountType();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "partner" + "'", str22, "partner");
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str11 = partner3.getEmail();
        partner3.login("hi!", "hi!");
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getAccountType();
        partner3.setVerified(true);
        boolean boolean19 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.setVerified(true);
        partner3.logout();
        partner3.logout();
        java.lang.String str8 = partner3.getID();
        partner3.logout();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        model.Partner partner3 = new model.Partner("partner", "hi!", "");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getPassword();
        java.lang.String str6 = partner3.getAccountType();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "");
        boolean boolean12 = partner3.isVerified();
        boolean boolean13 = partner3.isVerified();
        partner3.logout();
        java.lang.String str15 = partner3.getID();
        partner3.viewProfile();
        partner3.login("hi!", "");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.logout();
        partner3.logout();
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getID();
        java.lang.String str15 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str18 = partner3.getPassword();
        java.lang.String str19 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        java.lang.String str8 = partner3.getID();
        boolean boolean9 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.String str12 = partner3.getPassword();
        boolean boolean13 = partner3.isVerified();
        boolean boolean14 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        double double8 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getAccountType();
        partner3.login("hi!", "partner");
        double double14 = partner3.getHourlyRate();
        boolean boolean15 = partner3.isVerified();
        double double16 = partner3.getHourlyRate();
        java.lang.String str17 = partner3.getPassword();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        partner3.logout();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        partner3.login("", "hi!");
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getAccountType();
        partner3.viewProfile();
        double double17 = partner3.getHourlyRate();
        java.lang.String str18 = partner3.getAccountType();
        java.lang.String str19 = partner3.getEmail();
        java.lang.String str20 = partner3.getAccountType();
        boolean boolean21 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
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
        java.lang.String str15 = partner3.getAccountType();
        partner3.login("", "hi!");
        boolean boolean19 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getEmail();
        boolean boolean12 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getEmail();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getID();
        boolean boolean13 = partner3.isVerified();
        partner3.logout();
        partner3.login("hi!", "partner");
        partner3.viewProfile();
        partner3.login("", "hi!");
        java.lang.String str22 = partner3.getPassword();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str26 = partner3.getPassword();
        java.lang.Class<?> wildcardClass27 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
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
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
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
        boolean boolean19 = partner3.isVerified();
        java.lang.String str20 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getID();
        boolean boolean8 = partner3.isVerified();
        partner3.setVerified(true);
        partner3.setVerified(true);
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getEmail();
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getPassword();
        java.lang.String str19 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        partner3.login("hi!", "hi!");
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getPassword();
        boolean boolean14 = partner3.isVerified();
        java.lang.String str15 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        model.Partner partner3 = new model.Partner("", "", "partner");
        partner3.login("partner", "");
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.login("hi!", "hi!");
        partner3.login("", "partner");
        boolean boolean13 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getID();
        partner3.viewProfile();
        partner3.setVerified(true);
        double double16 = partner3.getHourlyRate();
        partner3.setVerified(false);
        double double19 = partner3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        partner3.logout();
        partner3.login("partner", "hi!");
        java.lang.String str16 = partner3.getAccountType();
        java.lang.String str17 = partner3.getPassword();
        java.lang.String str18 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
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
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str7 = partner3.getAccountType();
        partner3.login("partner", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        boolean boolean14 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str11 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getPassword();
        partner3.logout();
        partner3.login("partner", "");
        partner3.login("", "partner");
        partner3.setVerified(false);
        java.lang.String str21 = partner3.getEmail();
        java.lang.String str22 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
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
        partner3.setVerified(false);
        partner3.setVerified(true);
        partner3.setVerified(false);
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getEmail();
        partner3.login("partner", "partner");
        partner3.logout();
        java.lang.String str18 = partner3.getAccountType();
        double double19 = partner3.getHourlyRate();
        java.lang.String str20 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.setVerified(false);
        partner3.logout();
        boolean boolean11 = partner3.isVerified();
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getPassword();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getID();
        partner3.viewProfile();
        partner3.viewProfile();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.login("partner", "hi!");
        java.lang.String str12 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getPassword();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(true);
        boolean boolean11 = partner3.isVerified();
        partner3.login("hi!", "partner");
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.viewProfile();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getPassword();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
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
        double double16 = partner3.getHourlyRate();
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getAccountType();
        double double13 = partner3.getHourlyRate();
        partner3.logout();
        boolean boolean15 = partner3.isVerified();
        partner3.login("hi!", "");
        java.lang.String str19 = partner3.getID();
        partner3.setVerified(true);
        double double22 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getPassword();
        partner3.logout();
        java.lang.String str12 = partner3.getPassword();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getAccountType();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str17 = partner3.getID();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
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
        java.lang.String str22 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str8 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str12 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getID();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.login("hi!", "");
        partner3.logout();
        partner3.logout();
        partner3.logout();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getAccountType();
        partner3.setVerified(false);
        double double11 = partner3.getHourlyRate();
        partner3.login("", "hi!");
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str17 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str8 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str12 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getID();
        partner3.logout();
        double double17 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        double double13 = partner3.getHourlyRate();
        partner3.login("hi!", "");
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getID();
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.logout();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getAccountType();
        partner3.login("hi!", "");
        partner3.viewProfile();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str16 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        double double4 = partner3.getHourlyRate();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.logout();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getPassword();
        partner3.setVerified(true);
        boolean boolean14 = partner3.isVerified();
        boolean boolean15 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        java.lang.String str8 = partner3.getID();
        boolean boolean9 = partner3.isVerified();
        boolean boolean10 = partner3.isVerified();
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str14 = partner3.getEmail();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getID();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        model.Partner partner3 = new model.Partner("partner", "hi!", "");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getPassword();
        partner3.viewProfile();
        partner3.login("partner", "partner");
        java.lang.String str10 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        model.Partner partner3 = new model.Partner("", "hi!", "hi!");
        partner3.login("partner", "partner");
        partner3.login("partner", "hi!");
        partner3.login("partner", "hi!");
        java.lang.String str13 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        boolean boolean8 = partner3.isVerified();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getEmail();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getAccountType();
        partner3.viewProfile();
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getAccountType();
        partner3.login("hi!", "");
        double double20 = partner3.getHourlyRate();
        java.lang.String str21 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
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
        double double23 = partner3.getHourlyRate();
        java.lang.String str24 = partner3.getID();
        partner3.viewProfile();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 50.0d + "'", double23 == 50.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.logout();
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        partner3.setVerified(false);
        java.lang.String str14 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getID();
        partner3.login("partner", "hi!");
        java.lang.String str18 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getPassword();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
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
        java.lang.String str13 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
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
        java.lang.String str16 = partner3.getEmail();
        boolean boolean17 = partner3.isVerified();
        partner3.login("", "partner");
        partner3.setVerified(false);
        partner3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str11 = partner3.getEmail();
        partner3.setVerified(false);
        boolean boolean14 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        partner3.setVerified(true);
        java.lang.String str14 = partner3.getPassword();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
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
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getEmail();
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        boolean boolean11 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str12 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        partner3.login("partner", "");
        java.lang.String str14 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getEmail();
        double double13 = partner3.getHourlyRate();
        partner3.login("", "partner");
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        partner3.login("partner", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getEmail();
        partner3.login("", "partner");
        java.lang.String str19 = partner3.getEmail();
        java.lang.String str20 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
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
        boolean boolean17 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
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
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("partner", "");
        double double22 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
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
        java.lang.String str14 = partner3.getID();
        partner3.logout();
        partner3.login("partner", "partner");
        boolean boolean19 = partner3.isVerified();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getID();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        boolean boolean11 = partner3.isVerified();
        double double12 = partner3.getHourlyRate();
        boolean boolean13 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.String str16 = partner3.getID();
        partner3.login("", "hi!");
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getAccountType();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        java.lang.String str4 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getPassword();
        java.lang.String str11 = partner3.getPassword();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getPassword();
        partner3.viewProfile();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getID();
        boolean boolean13 = partner3.isVerified();
        partner3.login("partner", "hi!");
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getAccountType();
        java.lang.String str19 = partner3.getAccountType();
        java.lang.String str20 = partner3.getID();
        java.lang.String str21 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str23 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        double double9 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getEmail();
        partner3.setVerified(true);
        boolean boolean12 = partner3.isVerified();
        partner3.setVerified(false);
        partner3.login("partner", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        partner3.setVerified(true);
        partner3.setVerified(true);
        partner3.logout();
        boolean boolean13 = partner3.isVerified();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getEmail();
        double double13 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str15 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str17 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getEmail();
        double double14 = partner3.getHourlyRate();
        partner3.logout();
        double double16 = partner3.getHourlyRate();
        java.lang.String str17 = partner3.getEmail();
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.login("", "hi!");
        double double15 = partner3.getHourlyRate();
        partner3.logout();
        double double17 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        partner3.login("partner", "");
        boolean boolean11 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str13 = partner3.getID();
        partner3.viewProfile();
        double double15 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
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
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getID();
        partner3.login("", "partner");
        partner3.viewProfile();
        partner3.viewProfile();
        double double21 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        boolean boolean11 = partner3.isVerified();
        partner3.login("partner", "");
        boolean boolean15 = partner3.isVerified();
        boolean boolean16 = partner3.isVerified();
        java.lang.String str17 = partner3.getEmail();
        java.lang.String str18 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
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
        java.lang.String str18 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        boolean boolean11 = partner3.isVerified();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.logout();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getEmail();
        boolean boolean12 = partner3.isVerified();
        boolean boolean13 = partner3.isVerified();
        double double14 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
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
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str26 = partner3.getID();
        partner3.logout();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        double double4 = partner3.getHourlyRate();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        boolean boolean7 = partner3.isVerified();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        boolean boolean8 = partner3.isVerified();
        boolean boolean9 = partner3.isVerified();
        double double10 = partner3.getHourlyRate();
        boolean boolean11 = partner3.isVerified();
        double double12 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        partner3.setVerified(true);
        java.lang.String str14 = partner3.getPassword();
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getEmail();
        partner3.logout();
        partner3.setVerified(false);
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        boolean boolean6 = partner3.isVerified();
        java.lang.String str7 = partner3.getEmail();
        partner3.login("", "partner");
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getEmail();
        boolean boolean13 = partner3.isVerified();
        partner3.login("", "hi!");
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
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
        partner3.login("", "hi!");
        java.lang.String str22 = partner3.getEmail();
        double double23 = partner3.getHourlyRate();
        partner3.viewProfile();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 50.0d + "'", double23 == 50.0d);
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
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
        partner3.viewProfile();
        java.lang.String str16 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.logout();
        java.lang.String str5 = partner3.getPassword();
        java.lang.String str6 = partner3.getEmail();
        partner3.login("partner", "partner");
        double double10 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.setVerified(true);
        java.lang.String str6 = partner3.getPassword();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        double double9 = partner3.getHourlyRate();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str13 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getID();
        boolean boolean17 = partner3.isVerified();
        partner3.logout();
        boolean boolean19 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        model.Partner partner3 = new model.Partner("partner", "hi!", "");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getPassword();
        partner3.viewProfile();
        partner3.login("partner", "partner");
        boolean boolean10 = partner3.isVerified();
        boolean boolean11 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        partner3.logout();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        partner3.setVerified(false);
        double double13 = partner3.getHourlyRate();
        partner3.setVerified(true);
        java.lang.String str16 = partner3.getPassword();
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getPassword();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        double double4 = partner3.getHourlyRate();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getAccountType();
        partner3.login("partner", "");
        partner3.login("partner", "");
        partner3.logout();
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getID();
        double double17 = partner3.getHourlyRate();
        double double18 = partner3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
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
        java.lang.String str16 = partner3.getPassword();
        double double17 = partner3.getHourlyRate();
        partner3.logout();
        partner3.logout();
        double double20 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
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
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.setVerified(true);
        partner3.login("partner", "partner");
        partner3.logout();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getAccountType();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        partner3.setVerified(false);
        partner3.setVerified(false);
        boolean boolean17 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
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
        java.lang.String str16 = partner3.getID();
        java.lang.String str17 = partner3.getAccountType();
        partner3.setVerified(true);
        boolean boolean20 = partner3.isVerified();
        partner3.viewProfile();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
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
        partner3.logout();
        java.lang.String str14 = partner3.getEmail();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getAccountType();
        double double13 = partner3.getHourlyRate();
        partner3.logout();
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getPassword();
        partner3.login("partner", "hi!");
        partner3.login("", "partner");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
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
        partner3.logout();
        java.lang.String str22 = partner3.getAccountType();
        boolean boolean23 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "partner" + "'", str22, "partner");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        boolean boolean9 = partner3.isVerified();
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
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
        double double15 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str17 = partner3.getEmail();
        boolean boolean18 = partner3.isVerified();
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
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
        java.lang.String str16 = partner3.getAccountType();
        java.lang.String str17 = partner3.getEmail();
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getPassword();
        double double20 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getID();
        double double12 = partner3.getHourlyRate();
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        model.Partner partner3 = new model.Partner("", "", "partner");
        partner3.login("partner", "");
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.login("partner", "");
        partner3.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        partner3.setVerified(true);
        partner3.setVerified(true);
        boolean boolean17 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str21 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(true);
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getAccountType();
        partner3.login("", "hi!");
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getID();
        boolean boolean12 = partner3.isVerified();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str16 = partner3.getID();
        double double17 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
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
        boolean boolean19 = partner3.isVerified();
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "partner");
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        model.Partner partner3 = new model.Partner("partner", "partner", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(true);
        double double9 = partner3.getHourlyRate();
        partner3.login("partner", "");
        double double13 = partner3.getHourlyRate();
        partner3.setVerified(true);
        partner3.viewProfile();
        java.lang.String str17 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.setVerified(true);
        partner3.login("", "hi!");
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        double double12 = partner3.getHourlyRate();
        boolean boolean13 = partner3.isVerified();
        boolean boolean14 = partner3.isVerified();
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getPassword();
        double double17 = partner3.getHourlyRate();
        java.lang.String str18 = partner3.getAccountType();
        partner3.login("hi!", "partner");
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
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
        java.lang.String str18 = partner3.getEmail();
        double double19 = partner3.getHourlyRate();
        double double20 = partner3.getHourlyRate();
        java.lang.String str21 = partner3.getID();
        partner3.logout();
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.login("", "partner");
        double double9 = partner3.getHourlyRate();
        partner3.login("hi!", "");
        partner3.logout();
        partner3.logout();
        java.lang.String str15 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        model.Partner partner3 = new model.Partner("", "hi!", "hi!");
        partner3.login("partner", "partner");
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        partner3.login("partner", "hi!");
        java.lang.String str13 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getEmail();
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        model.Partner partner3 = new model.Partner("partner", "partner", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getID();
        partner3.login("partner", "hi!");
        partner3.login("", "");
        java.lang.String str13 = partner3.getID();
        double double14 = partner3.getHourlyRate();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
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
        java.lang.String str19 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.login("", "partner");
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getAccountType();
        partner3.login("partner", "partner");
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getEmail();
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
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
        java.lang.String str16 = partner3.getPassword();
        double double17 = partner3.getHourlyRate();
        double double18 = partner3.getHourlyRate();
        partner3.viewProfile();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getEmail();
        partner3.login("partner", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getEmail();
        double double9 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
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
        partner3.logout();
        java.lang.String str15 = partner3.getEmail();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getPassword();
        partner3.login("partner", "partner");
        double double15 = partner3.getHourlyRate();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
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
        java.lang.String str14 = partner3.getEmail();
        partner3.login("hi!", "");
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str21 = partner3.getAccountType();
        partner3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getID();
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
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
        double double21 = partner3.getHourlyRate();
        boolean boolean22 = partner3.isVerified();
        java.lang.String str23 = partner3.getPassword();
        partner3.logout();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
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
        java.lang.String str14 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str16 = partner3.getPassword();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getPassword();
        partner3.login("hi!", "");
        partner3.setVerified(true);
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getAccountType();
        partner3.setVerified(true);
        double double19 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        partner3.logout();
        double double11 = partner3.getHourlyRate();
        partner3.viewProfile();
        boolean boolean13 = partner3.isVerified();
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getID();
        boolean boolean10 = partner3.isVerified();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getPassword();
        partner3.logout();
        double double17 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        partner3.viewProfile();
        double double10 = partner3.getHourlyRate();
        partner3.setVerified(false);
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str16 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        partner3.login("partner", "");
        partner3.login("", "");
        partner3.viewProfile();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str17 = partner3.getEmail();
        double double18 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
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
        java.lang.String str16 = partner3.getAccountType();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        partner3.logout();
        java.lang.String str6 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        partner3.setVerified(true);
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getPassword();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        double double11 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str13 = partner3.getID();
        boolean boolean14 = partner3.isVerified();
        java.lang.String str15 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
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
        double double25 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str27 = partner3.getEmail();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 50.0d + "'", double25 == 50.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }
}

