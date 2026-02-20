import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05001");
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
        partner3.setVerified(false);
        java.lang.String str17 = partner3.getEmail();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05002");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        boolean boolean11 = partner3.isVerified();
        double double12 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05003");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.login("hi!", "");
        boolean boolean13 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05004");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        partner3.login("partner", "partner");
        java.lang.String str13 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str15 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05005");
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
        java.lang.String str19 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str22 = partner3.getAccountType();
        java.lang.String str23 = partner3.getAccountType();
        java.lang.String str24 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "partner" + "'", str22, "partner");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05006");
        model.Partner partner3 = new model.Partner("hi!", "", "partner");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str9 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05007");
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
        java.lang.String str14 = partner3.getAccountType();
        boolean boolean15 = partner3.isVerified();
        partner3.logout();
        java.lang.String str17 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05008");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getPassword();
        partner3.setVerified(true);
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05009");
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
        java.lang.String str18 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05010");
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
        partner3.logout();
        partner3.logout();
        java.lang.Class<?> wildcardClass22 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05011");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        partner3.logout();
        partner3.logout();
        java.lang.String str7 = partner3.getID();
        partner3.logout();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05012");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getPassword();
        partner3.setVerified(true);
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05013");
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
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getPassword();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05014");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getID();
        partner3.login("", "partner");
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05015");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05016");
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
        partner3.login("hi!", "hi!");
        partner3.login("partner", "partner");
        boolean boolean25 = partner3.isVerified();
        java.lang.String str26 = partner3.getID();
        partner3.viewProfile();
        partner3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05017");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        boolean boolean13 = partner3.isVerified();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05018");
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
        partner3.login("hi!", "");
        java.lang.String str18 = partner3.getAccountType();
        java.lang.String str19 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05019");
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
        java.lang.String str17 = partner3.getEmail();
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
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05020");
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
        partner3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05021");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        boolean boolean7 = partner3.isVerified();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05022");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getPassword();
        partner3.login("hi!", "partner");
        java.lang.String str16 = partner3.getID();
        double double17 = partner3.getHourlyRate();
        double double18 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05023");
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
        partner3.logout();
        boolean boolean21 = partner3.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05024");
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
        java.lang.String str16 = partner3.getPassword();
        partner3.setVerified(false);
        boolean boolean19 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05025");
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
        partner3.setVerified(true);
        java.lang.String str19 = partner3.getID();
        partner3.login("partner", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05026");
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
        java.lang.String str16 = partner3.getPassword();
        boolean boolean17 = partner3.isVerified();
        partner3.setVerified(true);
        double double20 = partner3.getHourlyRate();
        boolean boolean21 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05027");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getID();
        partner3.setVerified(true);
        boolean boolean14 = partner3.isVerified();
        java.lang.String str15 = partner3.getEmail();
        double double16 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05028");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getAccountType();
        double double10 = partner3.getHourlyRate();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getAccountType();
        partner3.login("", "");
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str18 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05029");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str12 = partner3.getAccountType();
        partner3.logout();
        boolean boolean14 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05030");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getPassword();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getPassword();
        partner3.setVerified(true);
        partner3.logout();
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05031");
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
        boolean boolean14 = partner3.isVerified();
        java.lang.String str15 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05032");
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
        boolean boolean22 = partner3.isVerified();
        java.lang.String str23 = partner3.getID();
        partner3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05033");
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
        partner3.login("partner", "");
        partner3.logout();
        java.lang.String str18 = partner3.getEmail();
        java.lang.String str19 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05034");
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
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getAccountType();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05035");
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
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05036");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(true);
        boolean boolean11 = partner3.isVerified();
        partner3.login("hi!", "partner");
        boolean boolean15 = partner3.isVerified();
        boolean boolean16 = partner3.isVerified();
        java.lang.String str17 = partner3.getPassword();
        java.lang.String str18 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05037");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getID();
        double double14 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05038");
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
        double double15 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        double double18 = partner3.getHourlyRate();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05039");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getPassword();
        java.lang.String str11 = partner3.getID();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05040");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        java.lang.String str4 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.logout();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05041");
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
        boolean boolean18 = partner3.isVerified();
        java.lang.String str19 = partner3.getAccountType();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass22 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05042");
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
        java.lang.String str18 = partner3.getID();
        double double19 = partner3.getHourlyRate();
        java.lang.String str20 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05043");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getID();
        partner3.logout();
        java.lang.String str12 = partner3.getID();
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05044");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getPassword();
        partner3.login("partner", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05045");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str17 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.login("", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05046");
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
        java.lang.String str20 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05047");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        partner3.viewProfile();
        partner3.logout();
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05048");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        partner3.setVerified(true);
        double double14 = partner3.getHourlyRate();
        double double15 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05049");
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
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str19 = partner3.getPassword();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05050");
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
        java.lang.String str17 = partner3.getID();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05051");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.login("", "partner");
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05052");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.login("", "");
        partner3.viewProfile();
        partner3.setVerified(false);
        double double19 = partner3.getHourlyRate();
        java.lang.String str20 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str22 = partner3.getAccountType();
        java.lang.String str23 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass24 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "partner" + "'", str22, "partner");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05053");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05054");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        partner3.login("", "hi!");
        boolean boolean13 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05055");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        double double9 = partner3.getHourlyRate();
        java.lang.String str10 = partner3.getEmail();
        boolean boolean11 = partner3.isVerified();
        partner3.login("hi!", "");
        partner3.logout();
        java.lang.String str16 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05056");
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
        partner3.logout();
        double double20 = partner3.getHourlyRate();
        boolean boolean21 = partner3.isVerified();
        double double22 = partner3.getHourlyRate();
        boolean boolean23 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05057");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        partner3.logout();
        partner3.logout();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05058");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        partner3.setVerified(true);
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05059");
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
        partner3.login("partner", "hi!");
        partner3.login("partner", "hi!");
        java.lang.String str22 = partner3.getAccountType();
        java.lang.String str23 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "partner" + "'", str22, "partner");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05060");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        boolean boolean6 = partner3.isVerified();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05061");
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
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05062");
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
        boolean boolean17 = partner3.isVerified();
        double double18 = partner3.getHourlyRate();
        double double19 = partner3.getHourlyRate();
        java.lang.String str20 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05063");
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
        partner3.login("partner", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05064");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "partner");
        partner3.login("hi!", "partner");
        partner3.login("", "partner");
        java.lang.String str10 = partner3.getPassword();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05065");
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
        partner3.setVerified(true);
        double double21 = partner3.getHourlyRate();
        double double22 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass23 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05066");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str10 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05067");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        boolean boolean6 = partner3.isVerified();
        java.lang.String str7 = partner3.getEmail();
        partner3.login("", "partner");
        java.lang.String str11 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.login("partner", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05068");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.login("partner", "");
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getAccountType();
        double double9 = partner3.getHourlyRate();
        partner3.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05069");
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
        java.lang.String str16 = partner3.getEmail();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05070");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.logout();
        partner3.login("partner", "hi!");
        java.lang.String str13 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05071");
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
        java.lang.String str13 = partner3.getPassword();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getAccountType();
        double double17 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05072");
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
        java.lang.String str19 = partner3.getAccountType();
        java.lang.String str20 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05073");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05074");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        partner3.login("", "partner");
        partner3.login("", "partner");
        partner3.setVerified(true);
        boolean boolean17 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05075");
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
        java.lang.String str13 = partner3.getPassword();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05076");
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
        java.lang.String str16 = partner3.getAccountType();
        boolean boolean17 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05077");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.setVerified(true);
        java.lang.String str15 = partner3.getAccountType();
        partner3.setVerified(false);
        partner3.logout();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05078");
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
        partner3.login("", "");
        boolean boolean19 = partner3.isVerified();
        java.lang.String str20 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05079");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "");
        partner3.login("", "");
        partner3.logout();
        java.lang.String str16 = partner3.getEmail();
        partner3.login("hi!", "partner");
        partner3.login("partner", "");
        partner3.login("partner", "partner");
        java.lang.String str26 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05080");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getID();
        partner3.login("hi!", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05081");
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
        partner3.logout();
        java.lang.String str17 = partner3.getEmail();
        double double18 = partner3.getHourlyRate();
        java.lang.String str19 = partner3.getID();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str23 = partner3.getPassword();
        java.lang.String str24 = partner3.getPassword();
        java.lang.String str25 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "partner" + "'", str25, "partner");
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05082");
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
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05083");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getID();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05084");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.viewProfile();
        java.lang.String str13 = partner3.getID();
        partner3.logout();
        java.lang.String str15 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05085");
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
        partner3.logout();
        java.lang.String str17 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05086");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05087");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getPassword();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getPassword();
        partner3.login("hi!", "partner");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05088");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05089");
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
        java.lang.String str13 = partner3.getEmail();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05090");
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
        java.lang.String str15 = partner3.getID();
        partner3.logout();
        partner3.setVerified(false);
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05091");
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
        double double16 = partner3.getHourlyRate();
        boolean boolean17 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05092");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        partner3.logout();
        java.lang.String str12 = partner3.getID();
        partner3.setVerified(true);
        boolean boolean15 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str17 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05093");
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
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05094");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        partner3.logout();
        partner3.login("partner", "hi!");
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str19 = partner3.getID();
        java.lang.String str20 = partner3.getID();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05095");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.setVerified(true);
        partner3.logout();
        partner3.setVerified(true);
        partner3.setVerified(false);
        boolean boolean11 = partner3.isVerified();
        partner3.logout();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05096");
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
        java.lang.String str17 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05097");
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
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05098");
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
        partner3.setVerified(false);
        java.lang.String str21 = partner3.getID();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05099");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        partner3.login("hi!", "hi!");
        java.lang.String str15 = partner3.getID();
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05100");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getEmail();
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05101");
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
        partner3.login("hi!", "partner");
        double double18 = partner3.getHourlyRate();
        partner3.login("", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05102");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        partner3.login("partner", "hi!");
        double double14 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05103");
        model.Partner partner3 = new model.Partner("partner", "hi!", "partner");
        boolean boolean4 = partner3.isVerified();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05104");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        partner3.login("partner", "");
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05105");
        model.Partner partner3 = new model.Partner("partner", "hi!", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        double double5 = partner3.getHourlyRate();
        boolean boolean6 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05106");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        partner3.login("", "hi!");
        double double12 = partner3.getHourlyRate();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getAccountType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05107");
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
        java.lang.String str19 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05108");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getEmail();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05109");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getAccountType();
        boolean boolean10 = partner3.isVerified();
        partner3.login("", "");
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05110");
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
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05111");
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
        java.lang.String str19 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05112");
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
        double double15 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05113");
        model.Partner partner3 = new model.Partner("hi!", "", "partner");
        java.lang.String str4 = partner3.getPassword();
        partner3.logout();
        boolean boolean6 = partner3.isVerified();
        java.lang.String str7 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05114");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.logout();
        partner3.logout();
        partner3.logout();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        partner3.setVerified(false);
        partner3.login("hi!", "");
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05115");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        double double11 = partner3.getHourlyRate();
        partner3.setVerified(true);
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05116");
        model.Partner partner3 = new model.Partner("hi!", "", "");
        partner3.login("hi!", "");
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05117");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getID();
        partner3.logout();
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getID();
        boolean boolean16 = partner3.isVerified();
        partner3.login("hi!", "hi!");
        partner3.setVerified(false);
        java.lang.String str22 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05118");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.logout();
        double double14 = partner3.getHourlyRate();
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getPassword();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05119");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        java.lang.String str6 = partner3.getID();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05120");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        partner3.logout();
        boolean boolean9 = partner3.isVerified();
        boolean boolean10 = partner3.isVerified();
        double double11 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05121");
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
        java.lang.String str18 = partner3.getEmail();
        java.lang.String str19 = partner3.getPassword();
        java.lang.String str20 = partner3.getID();
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05122");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        double double6 = partner3.getHourlyRate();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        java.lang.String str14 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05123");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getAccountType();
        partner3.logout();
        partner3.viewProfile();
        double double14 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05124");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getPassword();
        partner3.setVerified(false);
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05125");
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
        java.lang.String str19 = partner3.getAccountType();
        partner3.login("", "partner");
        java.lang.String str23 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05126");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        double double11 = partner3.getHourlyRate();
        double double12 = partner3.getHourlyRate();
        partner3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05127");
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
        double double18 = partner3.getHourlyRate();
        boolean boolean19 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05128");
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
        java.lang.String str13 = partner3.getPassword();
        partner3.logout();
        java.lang.String str15 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05129");
        model.Partner partner3 = new model.Partner("", "partner", "");
        double double4 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05130");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getPassword();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05131");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "hi!");
        partner3.logout();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getID();
        partner3.login("partner", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05132");
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
        double double22 = partner3.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05133");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(true);
        partner3.login("hi!", "hi!");
        java.lang.String str16 = partner3.getPassword();
        java.lang.String str17 = partner3.getID();
        partner3.viewProfile();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05134");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getID();
        partner3.logout();
        partner3.logout();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getID();
        double double17 = partner3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05135");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getPassword();
        partner3.setVerified(true);
        double double14 = partner3.getHourlyRate();
        boolean boolean15 = partner3.isVerified();
        double double16 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05136");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.login("", "hi!");
        partner3.login("partner", "hi!");
        boolean boolean14 = partner3.isVerified();
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getAccountType();
        boolean boolean17 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05137");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.login("hi!", "");
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getPassword();
        partner3.login("partner", "hi!");
        java.lang.String str18 = partner3.getEmail();
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05138");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        partner3.setVerified(false);
        partner3.login("hi!", "");
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05139");
        model.Partner partner3 = new model.Partner("hi!", "", "partner");
        java.lang.String str4 = partner3.getPassword();
        partner3.viewProfile();
        boolean boolean6 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05140");
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
        partner3.logout();
        partner3.setVerified(false);
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05141");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        partner3.login("partner", "");
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getPassword();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05142");
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
        partner3.logout();
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getEmail();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05143");
        model.Partner partner3 = new model.Partner("partner", "hi!", "partner");
        java.lang.String str4 = partner3.getID();
        partner3.login("", "");
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05144");
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
        java.lang.String str17 = partner3.getAccountType();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05145");
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
        boolean boolean18 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05146");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.setVerified(true);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05147");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getPassword();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05148");
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
        double double18 = partner3.getHourlyRate();
        java.lang.String str19 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05149");
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
        java.lang.String str17 = partner3.getAccountType();
        partner3.login("partner", "partner");
        boolean boolean21 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05150");
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
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getEmail();
        partner3.login("hi!", "partner");
        double double23 = partner3.getHourlyRate();
        java.lang.String str24 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 50.0d + "'", double23 == 50.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05151");
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
        java.lang.String str15 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05152");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        double double7 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05153");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        partner3.logout();
        boolean boolean12 = partner3.isVerified();
        boolean boolean13 = partner3.isVerified();
        boolean boolean14 = partner3.isVerified();
        java.lang.String str15 = partner3.getAccountType();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05154");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getEmail();
        partner3.viewProfile();
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05155");
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
        boolean boolean16 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05156");
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
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05157");
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
        java.lang.String str18 = partner3.getID();
        java.lang.String str19 = partner3.getPassword();
        java.lang.String str20 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str22 = partner3.getID();
        java.lang.String str23 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05158");
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
        java.lang.String str16 = partner3.getPassword();
        java.lang.String str17 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05159");
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
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05160");
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
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.logout();
        java.lang.String str19 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05161");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        boolean boolean12 = partner3.isVerified();
        partner3.login("partner", "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05162");
        model.Partner partner3 = new model.Partner("partner", "hi!", "");
        partner3.login("hi!", "hi!");
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05163");
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
        double double14 = partner3.getHourlyRate();
        partner3.viewProfile();
        boolean boolean16 = partner3.isVerified();
        partner3.login("partner", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05164");
        model.Partner partner3 = new model.Partner("partner", "hi!", "");
        partner3.login("hi!", "hi!");
        partner3.logout();
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05165");
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
        boolean boolean17 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05166");
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
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05167");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        java.lang.String str4 = partner3.getEmail();
        double double5 = partner3.getHourlyRate();
        double double6 = partner3.getHourlyRate();
        partner3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05168");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        boolean boolean9 = partner3.isVerified();
        partner3.viewProfile();
        double double11 = partner3.getHourlyRate();
        partner3.login("hi!", "");
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05169");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(false);
        partner3.login("partner", "hi!");
        java.lang.String str11 = partner3.getPassword();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05170");
        model.Partner partner3 = new model.Partner("hi!", "partner", "partner");
        java.lang.String str4 = partner3.getID();
        partner3.setVerified(true);
        partner3.viewProfile();
        partner3.login("", "");
        partner3.login("hi!", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05171");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getPassword();
        double double11 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05172");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        double double10 = partner3.getHourlyRate();
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getAccountType();
        partner3.viewProfile();
        boolean boolean15 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05173");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getEmail();
        partner3.logout();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str15 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05174");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getPassword();
        partner3.viewProfile();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05175");
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
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05176");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        boolean boolean8 = partner3.isVerified();
        partner3.setVerified(true);
        boolean boolean11 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str13 = partner3.getPassword();
        partner3.login("", "");
        java.lang.String str17 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05177");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        double double8 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        partner3.login("partner", "");
        boolean boolean15 = partner3.isVerified();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05178");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.logout();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("partner", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05179");
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
        java.lang.String str14 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05180");
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
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05181");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        double double8 = partner3.getHourlyRate();
        partner3.logout();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getPassword();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05182");
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
        partner3.logout();
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
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05183");
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
        partner3.logout();
        java.lang.String str22 = partner3.getPassword();
        java.lang.String str23 = partner3.getAccountType();
        partner3.logout();
        partner3.logout();
        java.lang.Class<?> wildcardClass26 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05184");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str12 = partner3.getEmail();
        partner3.logout();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05185");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getPassword();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getPassword();
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getAccountType();
        partner3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05186");
        model.Partner partner3 = new model.Partner("", "partner", "");
        java.lang.String str4 = partner3.getPassword();
        java.lang.String str5 = partner3.getEmail();
        partner3.login("hi!", "hi!");
        partner3.logout();
        double double10 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05187");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        partner3.setVerified(false);
        double double12 = partner3.getHourlyRate();
        partner3.setVerified(false);
        partner3.login("partner", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05188");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        double double12 = partner3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05189");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getAccountType();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05190");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        double double11 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str13 = partner3.getPassword();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str17 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05191");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        partner3.logout();
        partner3.login("partner", "");
        java.lang.String str12 = partner3.getID();
        partner3.logout();
        java.lang.String str14 = partner3.getID();
        boolean boolean15 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05192");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getID();
        boolean boolean10 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str13 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05193");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getID();
        partner3.login("", "hi!");
        partner3.setVerified(false);
        boolean boolean13 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05194");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.login("partner", "hi!");
        java.lang.String str12 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getPassword();
        boolean boolean17 = partner3.isVerified();
        java.lang.String str18 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05195");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getID();
        boolean boolean9 = partner3.isVerified();
        partner3.login("", "hi!");
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05196");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getEmail();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getID();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05197");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str16 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05198");
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
        java.lang.String str14 = partner3.getPassword();
        partner3.logout();
        double double16 = partner3.getHourlyRate();
        partner3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05199");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        partner3.login("partner", "");
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05200");
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
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05201");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        boolean boolean6 = partner3.isVerified();
        boolean boolean7 = partner3.isVerified();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05202");
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
        partner3.setVerified(false);
        java.lang.String str21 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05203");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getEmail();
        double double10 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str12 = partner3.getID();
        partner3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05204");
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
        partner3.viewProfile();
        partner3.login("partner", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05205");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05206");
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
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.String str18 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05207");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("", "partner");
        java.lang.String str11 = partner3.getPassword();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05208");
        model.Partner partner3 = new model.Partner("partner", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        partner3.setVerified(false);
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getPassword();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05209");
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
        partner3.setVerified(false);
        java.lang.String str26 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05210");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.logout();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getEmail();
        partner3.logout();
        partner3.setVerified(true);
        partner3.login("hi!", "partner");
        java.lang.String str14 = partner3.getPassword();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05211");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        partner3.setVerified(true);
        double double15 = partner3.getHourlyRate();
        double double16 = partner3.getHourlyRate();
        boolean boolean17 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05212");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05213");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getPassword();
        partner3.login("partner", "partner");
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05214");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getEmail();
        boolean boolean11 = partner3.isVerified();
        partner3.viewProfile();
        partner3.login("", "partner");
        java.lang.String str16 = partner3.getPassword();
        double double17 = partner3.getHourlyRate();
        java.lang.String str18 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05215");
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
        partner3.logout();
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
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05216");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        partner3.login("partner", "");
        double double14 = partner3.getHourlyRate();
        double double15 = partner3.getHourlyRate();
        double double16 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05217");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        partner3.login("partner", "");
        java.lang.String str11 = partner3.getAccountType();
        partner3.login("hi!", "partner");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str18 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05218");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        partner3.viewProfile();
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05219");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "partner");
        partner3.login("hi!", "hi!");
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05220");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        partner3.logout();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getID();
        java.lang.String str15 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05221");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str7 = partner3.getAccountType();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05222");
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
        java.lang.String str14 = partner3.getPassword();
        partner3.logout();
        boolean boolean16 = partner3.isVerified();
        java.lang.String str17 = partner3.getID();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05223");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getID();
        boolean boolean8 = partner3.isVerified();
        partner3.setVerified(true);
        partner3.setVerified(true);
        double double13 = partner3.getHourlyRate();
        partner3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05224");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        partner3.login("", "");
        partner3.logout();
        java.lang.String str14 = partner3.getPassword();
        java.lang.String str15 = partner3.getID();
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05225");
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
        partner3.setVerified(true);
        java.lang.String str19 = partner3.getAccountType();
        java.lang.String str20 = partner3.getEmail();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05226");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.setVerified(false);
        double double10 = partner3.getHourlyRate();
        partner3.login("", "");
        double double14 = partner3.getHourlyRate();
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05227");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("partner", "hi!");
        partner3.logout();
        partner3.login("partner", "");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05228");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.logout();
        double double10 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str12 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05229");
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
        java.lang.String str17 = partner3.getID();
        double double18 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05230");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        boolean boolean6 = partner3.isVerified();
        partner3.setVerified(false);
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05231");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        partner3.login("hi!", "");
        partner3.setVerified(false);
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05232");
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
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05233");
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
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05234");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getPassword();
        boolean boolean13 = partner3.isVerified();
        double double14 = partner3.getHourlyRate();
        double double15 = partner3.getHourlyRate();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05235");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        boolean boolean11 = partner3.isVerified();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getAccountType();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05236");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        partner3.logout();
        partner3.login("partner", "");
        partner3.viewProfile();
        java.lang.String str15 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05237");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        boolean boolean14 = partner3.isVerified();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getPassword();
        boolean boolean17 = partner3.isVerified();
        partner3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05238");
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
        java.lang.String str19 = partner3.getPassword();
        java.lang.String str20 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05239");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "");
        partner3.logout();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05240");
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
        boolean boolean15 = partner3.isVerified();
        partner3.login("", "partner");
        partner3.viewProfile();
        java.lang.String str20 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05241");
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
        partner3.setVerified(false);
        java.lang.String str17 = partner3.getEmail();
        java.lang.String str18 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05242");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        double double4 = partner3.getHourlyRate();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        boolean boolean7 = partner3.isVerified();
        double double8 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05243");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getPassword();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05244");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        boolean boolean6 = partner3.isVerified();
        java.lang.String str7 = partner3.getEmail();
        partner3.login("", "partner");
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getID();
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05245");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        boolean boolean6 = partner3.isVerified();
        java.lang.String str7 = partner3.getPassword();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05246");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        partner3.login("partner", "partner");
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getEmail();
        partner3.login("partner", "partner");
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05247");
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
        java.lang.String str15 = partner3.getEmail();
        partner3.login("partner", "hi!");
        java.lang.String str19 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05248");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        double double8 = partner3.getHourlyRate();
        partner3.login("", "");
        double double12 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05249");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        partner3.login("", "partner");
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getEmail();
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05250");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("partner", "hi!");
        partner3.login("hi!", "");
        partner3.login("hi!", "hi!");
        partner3.setVerified(true);
        boolean boolean20 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05251");
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
        double double17 = partner3.getHourlyRate();
        java.lang.String str18 = partner3.getID();
        partner3.login("partner", "");
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05252");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getID();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        partner3.login("partner", "hi!");
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05253");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getID();
        partner3.login("", "partner");
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05254");
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
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05255");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.setVerified(true);
        java.lang.String str6 = partner3.getPassword();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        double double9 = partner3.getHourlyRate();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05256");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.setVerified(true);
        double double13 = partner3.getHourlyRate();
        partner3.setVerified(true);
        partner3.setVerified(true);
        java.lang.String str18 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05257");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean8 = partner3.isVerified();
        partner3.setVerified(false);
        partner3.setVerified(false);
        partner3.logout();
        boolean boolean14 = partner3.isVerified();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05258");
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
        java.lang.String str18 = partner3.getPassword();
        java.lang.String str19 = partner3.getPassword();
        double double20 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05259");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "hi!");
        partner3.login("partner", "hi!");
        java.lang.String str13 = partner3.getPassword();
        partner3.viewProfile();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05260");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        double double4 = partner3.getHourlyRate();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getAccountType();
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        partner3.login("partner", "");
        boolean boolean13 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05261");
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
        java.lang.String str16 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05262");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getAccountType();
        partner3.login("hi!", "");
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05263");
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
        partner3.login("partner", "partner");
        java.lang.String str19 = partner3.getPassword();
        boolean boolean20 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05264");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getID();
        boolean boolean8 = partner3.isVerified();
        partner3.setVerified(true);
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getPassword();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05265");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getPassword();
        double double12 = partner3.getHourlyRate();
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05266");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("hi!", "partner");
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getAccountType();
        boolean boolean15 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05267");
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
        partner3.logout();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 50.0d + "'", double23 == 50.0d);
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05268");
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
        partner3.setVerified(true);
        partner3.viewProfile();
        java.lang.String str22 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05269");
        model.Partner partner3 = new model.Partner("", "partner", "");
        java.lang.String str4 = partner3.getPassword();
        java.lang.String str5 = partner3.getEmail();
        partner3.logout();
        java.lang.String str7 = partner3.getID();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getEmail();
        partner3.login("hi!", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05270");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("partner", "");
        java.lang.String str10 = partner3.getAccountType();
        double double11 = partner3.getHourlyRate();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05271");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        partner3.logout();
        partner3.login("partner", "hi!");
        partner3.logout();
        partner3.setVerified(false);
        boolean boolean19 = partner3.isVerified();
        java.lang.String str20 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05272");
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
        partner3.logout();
        java.lang.String str18 = partner3.getEmail();
        java.lang.String str19 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05273");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getEmail();
        boolean boolean10 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05274");
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
        java.lang.String str19 = partner3.getPassword();
        java.lang.String str20 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass23 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05275");
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
        java.lang.String str16 = partner3.getID();
        java.lang.String str17 = partner3.getEmail();
        java.lang.String str18 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05276");
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
        boolean boolean19 = partner3.isVerified();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05277");
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
        boolean boolean20 = partner3.isVerified();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05278");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.logout();
        partner3.logout();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05279");
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
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getPassword();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05280");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.setVerified(true);
        partner3.viewProfile();
        boolean boolean18 = partner3.isVerified();
        java.lang.String str19 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05281");
        model.Partner partner3 = new model.Partner("", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getEmail();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05282");
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
        java.lang.String str17 = partner3.getPassword();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05283");
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
        double double18 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05284");
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
        double double19 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05285");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.logout();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05286");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        boolean boolean8 = partner3.isVerified();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(true);
        partner3.logout();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05287");
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
        java.lang.String str20 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05288");
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
        double double18 = partner3.getHourlyRate();
        boolean boolean19 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05289");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.logout();
        partner3.logout();
        java.lang.String str6 = partner3.getEmail();
        partner3.logout();
        partner3.login("partner", "hi!");
        java.lang.String str11 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05290");
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
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05291");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str15 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05292");
        model.Partner partner3 = new model.Partner("hi!", "partner", "partner");
        partner3.setVerified(true);
        java.lang.String str6 = partner3.getPassword();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05293");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getID();
        partner3.logout();
        double double13 = partner3.getHourlyRate();
        partner3.logout();
        partner3.logout();
        boolean boolean16 = partner3.isVerified();
        java.lang.String str17 = partner3.getPassword();
        partner3.viewProfile();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05294");
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
        java.lang.String str21 = partner3.getID();
        partner3.login("partner", "partner");
        java.lang.String str25 = partner3.getID();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05295");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("hi!", "partner");
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05296");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        boolean boolean6 = partner3.isVerified();
        java.lang.String str7 = partner3.getEmail();
        partner3.login("", "partner");
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.String str13 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05297");
        model.Partner partner3 = new model.Partner("partner", "", "");
        partner3.logout();
        java.lang.String str5 = partner3.getPassword();
        java.lang.String str6 = partner3.getID();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05298");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.viewProfile();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getEmail();
        double double8 = partner3.getHourlyRate();
        partner3.login("", "");
        boolean boolean12 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05299");
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
        partner3.logout();
        java.lang.String str19 = partner3.getPassword();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05300");
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
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05301");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.login("", "partner");
        java.lang.String str8 = partner3.getPassword();
        double double9 = partner3.getHourlyRate();
        double double10 = partner3.getHourlyRate();
        double double11 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05302");
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
        java.lang.String str14 = partner3.getAccountType();
        boolean boolean15 = partner3.isVerified();
        partner3.logout();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05303");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        partner3.login("hi!", "hi!");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05304");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.login("partner", "");
        boolean boolean7 = partner3.isVerified();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05305");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getEmail();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05306");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "partner");
        partner3.login("hi!", "partner");
        java.lang.String str7 = partner3.getEmail();
        partner3.login("partner", "partner");
        boolean boolean11 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str14 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05307");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.viewProfile();
        partner3.setVerified(true);
        double double9 = partner3.getHourlyRate();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05308");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        double double7 = partner3.getHourlyRate();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05309");
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
        java.lang.String str15 = partner3.getAccountType();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05310");
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
        partner3.logout();
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
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05311");
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
        partner3.setVerified(true);
        partner3.logout();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05312");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str16 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05313");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05314");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        boolean boolean9 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05315");
        model.Partner partner3 = new model.Partner("partner", "", "");
        partner3.logout();
        java.lang.String str5 = partner3.getPassword();
        boolean boolean6 = partner3.isVerified();
        java.lang.String str7 = partner3.getAccountType();
        partner3.login("partner", "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05316");
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
        java.lang.String str16 = partner3.getID();
        java.lang.String str17 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05317");
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
        java.lang.String str16 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05318");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.setVerified(true);
        partner3.login("hi!", "");
        java.lang.String str12 = partner3.getPassword();
        partner3.login("hi!", "");
        partner3.setVerified(true);
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05319");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05320");
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
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05321");
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
        partner3.logout();
        boolean boolean17 = partner3.isVerified();
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
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05322");
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
        partner3.login("", "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05323");
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
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str17 = partner3.getPassword();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05324");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getID();
        double double5 = partner3.getHourlyRate();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getEmail();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05325");
        model.Partner partner3 = new model.Partner("", "hi!", "");
        partner3.login("hi!", "hi!");
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("hi!", "partner");
        java.lang.String str12 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05326");
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
        partner3.login("hi!", "hi!");
        boolean boolean20 = partner3.isVerified();
        java.lang.String str21 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05327");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getID();
        java.lang.String str15 = partner3.getID();
        java.lang.String str16 = partner3.getEmail();
        java.lang.String str17 = partner3.getID();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05328");
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
        partner3.login("", "hi!");
        partner3.viewProfile();
        java.lang.String str22 = partner3.getID();
        java.lang.String str23 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05329");
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
        partner3.viewProfile();
        java.lang.String str18 = partner3.getEmail();
        partner3.login("", "hi!");
        double double22 = partner3.getHourlyRate();
        java.lang.String str23 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass24 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "partner" + "'", str23, "partner");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05330");
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
        java.lang.String str19 = partner3.getPassword();
        boolean boolean20 = partner3.isVerified();
        java.lang.String str21 = partner3.getPassword();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05331");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.setVerified(true);
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
    }

    @Test
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05332");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        partner3.logout();
        java.lang.String str10 = partner3.getPassword();
        partner3.logout();
        partner3.setVerified(true);
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05333");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        partner3.login("hi!", "hi!");
        java.lang.String str9 = partner3.getID();
        partner3.logout();
        partner3.login("partner", "");
        boolean boolean14 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05334");
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
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05335");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        partner3.setVerified(false);
        partner3.login("", "hi!");
        java.lang.String str17 = partner3.getPassword();
        double double18 = partner3.getHourlyRate();
        java.lang.String str19 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05336");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        partner3.setVerified(false);
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05337");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        partner3.logout();
        java.lang.String str6 = partner3.getPassword();
        double double7 = partner3.getHourlyRate();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05338");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05339");
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
        boolean boolean16 = partner3.isVerified();
        java.lang.String str17 = partner3.getAccountType();
        double double18 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05340");
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
        partner3.login("hi!", "hi!");
        java.lang.String str22 = partner3.getAccountType();
        partner3.viewProfile();
        boolean boolean24 = partner3.isVerified();
        partner3.setVerified(false);
        partner3.login("partner", "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "partner" + "'", str22, "partner");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05341");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getEmail();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str16 = partner3.getEmail();
        java.lang.String str17 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.String str20 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05342");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getAccountType();
        partner3.login("partner", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05343");
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
        partner3.logout();
        partner3.setVerified(false);
        partner3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05344");
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
        java.lang.String str15 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05345");
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
        java.lang.String str17 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05346");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "hi!");
        java.lang.String str12 = partner3.getAccountType();
        partner3.logout();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05347");
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
        java.lang.String str20 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass22 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05348");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        partner3.login("partner", "partner");
        java.lang.String str13 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05349");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("", "partner");
        boolean boolean11 = partner3.isVerified();
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05350");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05351");
        model.Partner partner3 = new model.Partner("partner", "hi!", "");
        partner3.login("hi!", "hi!");
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        double double12 = partner3.getHourlyRate();
        double double13 = partner3.getHourlyRate();
        boolean boolean14 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05352");
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
        partner3.logout();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05353");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        partner3.login("partner", "");
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getID();
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05354");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        partner3.logout();
        partner3.login("partner", "hi!");
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str18 = partner3.getEmail();
        java.lang.String str19 = partner3.getAccountType();
        boolean boolean20 = partner3.isVerified();
        java.lang.String str21 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "partner" + "'", str19, "partner");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05355");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getPassword();
        partner3.logout();
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05356");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getEmail();
        double double9 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05357");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        boolean boolean12 = partner3.isVerified();
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05358");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        partner3.viewProfile();
        partner3.viewProfile();
        boolean boolean9 = partner3.isVerified();
        partner3.login("hi!", "partner");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05359");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        boolean boolean8 = partner3.isVerified();
        partner3.viewProfile();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05360");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.login("partner", "");
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getAccountType();
        double double9 = partner3.getHourlyRate();
        java.lang.String str10 = partner3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05361");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getAccountType();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05362");
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
        java.lang.String str18 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05363");
        model.Partner partner3 = new model.Partner("partner", "hi!", "");
        partner3.login("hi!", "hi!");
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        partner3.login("", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05364");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.setVerified(true);
        java.lang.String str6 = partner3.getPassword();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05365");
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
        partner3.viewProfile();
        partner3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05366");
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
        boolean boolean20 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str23 = partner3.getID();
        java.lang.String str24 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05367");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getPassword();
        partner3.login("partner", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05368");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        double double7 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        partner3.login("", "");
        java.lang.String str13 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05369");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str11 = partner3.getEmail();
        partner3.logout();
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05370");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getID();
        partner3.logout();
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getID();
        partner3.logout();
        java.lang.String str17 = partner3.getPassword();
        partner3.login("partner", "");
        java.lang.String str21 = partner3.getPassword();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05371");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getAccountType();
        partner3.logout();
        partner3.setVerified(false);
        partner3.setVerified(true);
        java.lang.String str18 = partner3.getAccountType();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05372");
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
        partner3.logout();
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getEmail();
        java.lang.String str19 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05373");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getPassword();
        double double5 = partner3.getHourlyRate();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str14 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05374");
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
        partner3.viewProfile();
        java.lang.String str19 = partner3.getEmail();
        partner3.login("partner", "partner");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05375");
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
        double double14 = partner3.getHourlyRate();
        partner3.login("", "hi!");
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05376");
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
        partner3.logout();
        java.lang.String str16 = partner3.getPassword();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05377");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05378");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getID();
        double double9 = partner3.getHourlyRate();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05379");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05380");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getID();
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getEmail();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05381");
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
        java.lang.String str17 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05382");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.login("partner", "hi!");
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getAccountType();
        partner3.viewProfile();
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05383");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        double double8 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        partner3.login("partner", "");
        partner3.setVerified(true);
        partner3.setVerified(false);
        double double19 = partner3.getHourlyRate();
        boolean boolean20 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05384");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.viewProfile();
        partner3.login("", "partner");
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        double double11 = partner3.getHourlyRate();
        boolean boolean12 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05385");
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
        boolean boolean14 = partner3.isVerified();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getID();
        java.lang.String str17 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05386");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        partner3.login("", "");
        java.lang.String str9 = partner3.getPassword();
        partner3.logout();
        partner3.login("partner", "hi!");
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05387");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "hi!");
        partner3.logout();
        java.lang.String str11 = partner3.getPassword();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05388");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        partner3.login("hi!", "");
        partner3.login("partner", "partner");
        partner3.setVerified(true);
        partner3.login("hi!", "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05389");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getID();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05390");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        double double4 = partner3.getHourlyRate();
        boolean boolean5 = partner3.isVerified();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05391");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "hi!");
        partner3.login("partner", "hi!");
        partner3.login("partner", "");
        java.lang.String str16 = partner3.getAccountType();
        java.lang.String str17 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05392");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        partner3.logout();
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05393");
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
        java.lang.String str14 = partner3.getPassword();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05394");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.setVerified(true);
        partner3.login("", "hi!");
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        double double12 = partner3.getHourlyRate();
        boolean boolean13 = partner3.isVerified();
        partner3.setVerified(false);
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05395");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.setVerified(true);
        partner3.login("", "hi!");
        partner3.viewProfile();
        partner3.login("hi!", "");
        java.lang.String str13 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05396");
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
        java.lang.String str16 = partner3.getPassword();
        java.lang.String str17 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str19 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05397");
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
        partner3.setVerified(true);
        boolean boolean23 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05398");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getID();
        boolean boolean12 = partner3.isVerified();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05399");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "partner");
        partner3.login("hi!", "partner");
        java.lang.String str7 = partner3.getEmail();
        boolean boolean8 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05400");
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
        partner3.logout();
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
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05401");
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
        java.lang.String str14 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05402");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        partner3.login("", "partner");
        partner3.login("", "partner");
        partner3.setVerified(true);
        double double17 = partner3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05403");
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
        partner3.logout();
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getEmail();
        java.lang.String str19 = partner3.getEmail();
        java.lang.String str20 = partner3.getEmail();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05404");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getEmail();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getID();
        boolean boolean15 = partner3.isVerified();
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05405");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        double double9 = partner3.getHourlyRate();
        java.lang.String str10 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05406");
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
        partner3.login("partner", "");
        java.lang.String str21 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05407");
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
        java.lang.String str18 = partner3.getEmail();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05408");
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
        partner3.setVerified(true);
        double double21 = partner3.getHourlyRate();
        double double22 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
    }

    @Test
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05409");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        boolean boolean9 = partner3.isVerified();
        partner3.viewProfile();
        boolean boolean11 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05410");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        boolean boolean11 = partner3.isVerified();
        partner3.login("hi!", "hi!");
        java.lang.String str15 = partner3.getAccountType();
        boolean boolean16 = partner3.isVerified();
        java.lang.String str17 = partner3.getEmail();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05411");
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
        partner3.logout();
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getEmail();
        java.lang.String str19 = partner3.getEmail();
        java.lang.String str20 = partner3.getEmail();
        java.lang.String str21 = partner3.getAccountType();
        java.lang.String str22 = partner3.getPassword();
        double double23 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 50.0d + "'", double23 == 50.0d);
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05412");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.login("", "");
        double double18 = partner3.getHourlyRate();
        boolean boolean19 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05413");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.setVerified(true);
        partner3.logout();
        partner3.logout();
        partner3.logout();
        partner3.setVerified(false);
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05414");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05415");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        boolean boolean8 = partner3.isVerified();
        partner3.setVerified(false);
        partner3.login("", "");
        java.lang.String str14 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05416");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.logout();
        java.lang.String str13 = partner3.getID();
        boolean boolean14 = partner3.isVerified();
        partner3.login("partner", "partner");
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05417");
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
        boolean boolean20 = partner3.isVerified();
        double double21 = partner3.getHourlyRate();
        double double22 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05418");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        partner3.login("partner", "");
        java.lang.String str9 = partner3.getAccountType();
        partner3.logout();
        boolean boolean11 = partner3.isVerified();
        boolean boolean12 = partner3.isVerified();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05419");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str11 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str13 = partner3.getEmail();
        double double14 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05420");
        model.Partner partner3 = new model.Partner("partner", "partner", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(true);
        double double9 = partner3.getHourlyRate();
        java.lang.String str10 = partner3.getPassword();
        java.lang.String str11 = partner3.getAccountType();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getPassword();
        double double14 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05421");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        partner3.logout();
        partner3.login("", "");
        java.lang.String str16 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05422");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "hi!");
        partner3.login("partner", "hi!");
        partner3.login("partner", "");
        partner3.viewProfile();
        java.lang.String str17 = partner3.getAccountType();
        java.lang.String str18 = partner3.getAccountType();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05423");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        partner3.setVerified(true);
        java.lang.String str14 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05424");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getAccountType();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.String str15 = partner3.getID();
        partner3.logout();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05425");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getID();
        boolean boolean15 = partner3.isVerified();
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05426");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getID();
        partner3.login("hi!", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05427");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05428");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getPassword();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getPassword();
        double double13 = partner3.getHourlyRate();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05429");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        boolean boolean6 = partner3.isVerified();
        java.lang.String str7 = partner3.getEmail();
        partner3.login("", "partner");
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getPassword();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05430");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.login("hi!", "hi!");
        partner3.logout();
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05431");
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
        partner3.login("hi!", "partner");
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05432");
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
        partner3.viewProfile();
        java.lang.String str18 = partner3.getEmail();
        partner3.login("", "hi!");
        double double22 = partner3.getHourlyRate();
        partner3.login("hi!", "");
        java.lang.Class<?> wildcardClass26 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05433");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        partner3.logout();
        boolean boolean9 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05434");
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
        java.lang.String str15 = partner3.getID();
        partner3.logout();
        partner3.login("hi!", "");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05435");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getEmail();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        double double11 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05436");
        model.Partner partner3 = new model.Partner("partner", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        partner3.setVerified(false);
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05437");
        model.Partner partner3 = new model.Partner("partner", "", "");
        partner3.logout();
        java.lang.String str5 = partner3.getPassword();
        boolean boolean6 = partner3.isVerified();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05438");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.login("partner", "");
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("partner", "hi!");
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        partner3.setVerified(true);
        partner3.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05439");
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
        partner3.setVerified(false);
        java.lang.String str19 = partner3.getID();
        double double20 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 50.0d + "'", double20 == 50.0d);
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05440");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getID();
        double double5 = partner3.getHourlyRate();
        java.lang.String str6 = partner3.getEmail();
        partner3.viewProfile();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05441");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(true);
        java.lang.String str11 = partner3.getEmail();
        partner3.login("hi!", "hi!");
        java.lang.String str15 = partner3.getEmail();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05442");
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
        boolean boolean14 = partner3.isVerified();
        partner3.viewProfile();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05443");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        partner3.login("partner", "partner");
        java.lang.String str13 = partner3.getPassword();
        boolean boolean14 = partner3.isVerified();
        partner3.setVerified(false);
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05444");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05445");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        boolean boolean10 = partner3.isVerified();
        partner3.setVerified(false);
        double double13 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05446");
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
        partner3.logout();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05447");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getPassword();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getID();
        partner3.login("hi!", "hi!");
        java.lang.String str15 = partner3.getID();
        double double16 = partner3.getHourlyRate();
        java.lang.String str17 = partner3.getPassword();
        boolean boolean18 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05448");
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
        partner3.login("hi!", "");
        java.lang.String str18 = partner3.getPassword();
        partner3.setVerified(true);
        java.lang.String str21 = partner3.getAccountType();
        java.lang.String str22 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05449");
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
        partner3.login("partner", "");
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05450");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getID();
        partner3.viewProfile();
        boolean boolean13 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05451");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        partner3.login("", "partner");
        partner3.login("", "partner");
        partner3.logout();
        java.lang.String str20 = partner3.getID();
        java.lang.String str21 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05452");
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
        partner3.viewProfile();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05453");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("", "partner");
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05454");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getID();
        boolean boolean10 = partner3.isVerified();
        partner3.viewProfile();
        partner3.login("", "");
        java.lang.String str15 = partner3.getID();
        partner3.viewProfile();
        partner3.login("", "hi!");
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05455");
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
        partner3.logout();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05456");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        boolean boolean6 = partner3.isVerified();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05457");
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
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05458");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05459");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        partner3.logout();
        double double14 = partner3.getHourlyRate();
        partner3.logout();
        partner3.logout();
        java.lang.String str17 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05460");
        model.Partner partner3 = new model.Partner("partner", "hi!", "");
        partner3.login("hi!", "hi!");
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        partner3.login("", "");
        java.lang.String str12 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05461");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05462");
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
        partner3.login("", "hi!");
        boolean boolean21 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str23 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05463");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getID();
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getPassword();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05464");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05465");
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
        partner3.setVerified(true);
        double double17 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05466");
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
        java.lang.String str17 = partner3.getID();
        partner3.login("hi!", "");
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05467");
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
        java.lang.Class<?> wildcardClass24 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05468");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05469");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.login("", "hi!");
        java.lang.String str20 = partner3.getPassword();
        java.lang.String str21 = partner3.getPassword();
        java.lang.String str22 = partner3.getAccountType();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "partner" + "'", str22, "partner");
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05470");
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
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05471");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        boolean boolean12 = partner3.isVerified();
        double double13 = partner3.getHourlyRate();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05472");
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
        java.lang.String str19 = partner3.getPassword();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05473");
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
        partner3.logout();
        java.lang.String str22 = partner3.getPassword();
        java.lang.String str23 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05474");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(false);
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getID();
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05475");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(true);
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getPassword();
        boolean boolean13 = partner3.isVerified();
        java.lang.String str14 = partner3.getEmail();
        double double15 = partner3.getHourlyRate();
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05476");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05477");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str8 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05478");
        model.Partner partner3 = new model.Partner("hi!", "", "partner");
        java.lang.String str4 = partner3.getPassword();
        java.lang.String str5 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05479");
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
        java.lang.String str15 = partner3.getEmail();
        boolean boolean16 = partner3.isVerified();
        double double17 = partner3.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05480");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        partner3.logout();
        partner3.viewProfile();
        double double8 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05481");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        partner3.viewProfile();
        double double14 = partner3.getHourlyRate();
        double double15 = partner3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05482");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getPassword();
        partner3.login("partner", "partner");
        partner3.viewProfile();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05483");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getAccountType();
        double double13 = partner3.getHourlyRate();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05484");
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
        java.lang.String str21 = partner3.getAccountType();
        java.lang.String str22 = partner3.getID();
        java.lang.String str23 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05485");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        partner3.setVerified(false);
        double double7 = partner3.getHourlyRate();
        partner3.setVerified(false);
        partner3.login("partner", "hi!");
        java.lang.String str13 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05486");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        partner3.login("hi!", "");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05487");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        partner3.login("partner", "partner");
        double double11 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str13 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05488");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        double double4 = partner3.getHourlyRate();
        partner3.logout();
        partner3.setVerified(false);
        partner3.logout();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05489");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.viewProfile();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        partner3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
    }

    @Test
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05490");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "partner");
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getPassword();
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05491");
        model.Partner partner3 = new model.Partner("partner", "hi!", "partner");
        boolean boolean4 = partner3.isVerified();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05492");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.logout();
        partner3.login("partner", "");
        java.lang.String str15 = partner3.getPassword();
        partner3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05493");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.login("", "partner");
        double double9 = partner3.getHourlyRate();
        partner3.login("hi!", "");
        java.lang.String str13 = partner3.getPassword();
        partner3.logout();
        java.lang.String str15 = partner3.getAccountType();
        java.lang.String str16 = partner3.getPassword();
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05494");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getEmail();
        partner3.logout();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05495");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(true);
        double double11 = partner3.getHourlyRate();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getID();
        partner3.login("partner", "partner");
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05496");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.setVerified(true);
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getEmail();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05497");
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
        partner3.login("partner", "partner");
        partner3.setVerified(false);
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
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05498");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getPassword();
        partner3.setVerified(true);
        java.lang.String str12 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05499");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        partner3.login("hi!", "");
        partner3.setVerified(false);
        java.lang.String str13 = partner3.getPassword();
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getPassword();
        boolean boolean16 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05500");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getEmail();
        double double11 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

