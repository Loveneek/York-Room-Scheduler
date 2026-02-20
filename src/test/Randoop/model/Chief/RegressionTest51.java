import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest51 {

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
    public void test25501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25501");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getAccountType();
        java.lang.String str6 = chief2.getAccountType();
        chief2.login("hi!", "");
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test25502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25502");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(false);
        chief2.login("chief", "");
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25503");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(true);
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getEmail();
        chief2.setVerified(true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test25504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25504");
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
        java.lang.String str19 = chief2.getAccountType();
        boolean boolean20 = chief2.isVerified();
        java.lang.String str21 = chief2.getPassword();
        java.lang.String str22 = chief2.getPassword();
        java.lang.String str23 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "chief" + "'", str23, "chief");
    }

    @Test
    public void test25505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25505");
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
        chief2.logout();
        boolean boolean16 = chief2.isVerified();
        chief2.viewProfile();
        boolean boolean18 = chief2.isVerified();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test25506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25506");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test25507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25507");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getID();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.setVerified(false);
        double double17 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test25508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25508");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean8 = chief2.isVerified();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getAccountType();
        boolean boolean15 = chief2.isVerified();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test25509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25509");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getEmail();
        chief2.login("", "chief");
        chief2.setVerified(true);
        java.lang.String str15 = chief2.getPassword();
        boolean boolean16 = chief2.isVerified();
        chief2.login("", "hi!");
        double double20 = chief2.getHourlyRate();
        boolean boolean21 = chief2.isVerified();
        java.lang.String str22 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test25510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25510");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        double double4 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25511");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getID();
        chief2.login("hi!", "");
        java.lang.String str16 = chief2.getEmail();
        boolean boolean17 = chief2.isVerified();
        java.lang.String str18 = chief2.getAccountType();
        java.lang.String str19 = chief2.getAccountType();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test25512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25512");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getEmail();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test25513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25513");
        model.Chief chief2 = new model.Chief("chief", "");
        double double3 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        double double8 = chief2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test25514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25514");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getPassword();
        java.lang.Class<?> wildcardClass9 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test25515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25515");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "");
        chief2.login("hi!", "hi!");
        double double13 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25516");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("chief", "chief");
        chief2.setVerified(false);
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test25517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25517");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getAccountType();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getID();
        chief2.setVerified(true);
        double double11 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test25518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25518");
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
        java.lang.String str20 = chief2.getID();
        chief2.logout();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test25519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25519");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("", "");
        double double11 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getPassword();
        java.lang.String str17 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test25520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25520");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "chief");
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str11 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test25521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25521");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        double double5 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str7 = chief2.getPassword();
        chief2.login("", "");
        chief2.viewProfile();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test25522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25522");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.login("", "hi!");
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test25523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25523");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        java.lang.String str8 = chief2.getAccountType();
        chief2.logout();
        chief2.login("hi!", "");
        chief2.login("", "hi!");
        chief2.viewProfile();
        java.lang.String str17 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test25524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25524");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        chief2.viewProfile();
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getPassword();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test25525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25525");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getPassword();
        chief2.login("chief", "hi!");
        java.lang.String str14 = chief2.getPassword();
        chief2.logout();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25526");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.login("chief", "");
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25527");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getID();
        chief2.setVerified(true);
        chief2.logout();
        chief2.setVerified(true);
        chief2.login("hi!", "hi!");
        chief2.viewProfile();
        java.lang.String str14 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25528");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25529");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getAccountType();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        chief2.login("", "chief");
        java.lang.String str11 = chief2.getPassword();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test25530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25530");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.login("hi!", "");
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getAccountType();
        boolean boolean14 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getID();
        java.lang.String str19 = chief2.getAccountType();
        java.lang.String str20 = chief2.getEmail();
        chief2.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test25531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25531");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str9 = chief2.getID();
        double double10 = chief2.getHourlyRate();
        double double11 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test25532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25532");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getEmail();
        chief2.login("", "");
        boolean boolean16 = chief2.isVerified();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test25533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25533");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        chief2.setVerified(false);
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test25534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25534");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        chief2.logout();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        double double10 = chief2.getHourlyRate();
        chief2.login("", "chief");
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getAccountType();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25535");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        chief2.login("", "hi!");
        chief2.logout();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getEmail();
        chief2.login("chief", "chief");
        chief2.login("hi!", "hi!");
        java.lang.String str22 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
    }

    @Test
    public void test25536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25536");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getAccountType();
        chief2.viewProfile();
        boolean boolean16 = chief2.isVerified();
        double double17 = chief2.getHourlyRate();
        java.lang.String str18 = chief2.getAccountType();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test25537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25537");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("", "chief");
        java.lang.String str12 = chief2.getAccountType();
        double double13 = chief2.getHourlyRate();
        double double14 = chief2.getHourlyRate();
        double double15 = chief2.getHourlyRate();
        boolean boolean16 = chief2.isVerified();
        chief2.setVerified(true);
        double double19 = chief2.getHourlyRate();
        java.lang.String str20 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass21 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test25538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25538");
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
        chief2.login("", "hi!");
        java.lang.String str16 = chief2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25539");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(true);
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getID();
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25540");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getAccountType();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getPassword();
        chief2.login("chief", "hi!");
        chief2.logout();
        java.lang.String str16 = chief2.getID();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25541");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        chief2.login("hi!", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25542");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        chief2.login("chief", "hi!");
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test25543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25543");
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
        java.lang.String str17 = chief2.getAccountType();
        java.lang.String str18 = chief2.getEmail();
        boolean boolean19 = chief2.isVerified();
        java.lang.String str20 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test25544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25544");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        chief2.setVerified(true);
        chief2.viewProfile();
        java.lang.String str12 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test25545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25545");
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
        chief2.login("hi!", "chief");
        chief2.viewProfile();
        java.lang.String str19 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test25546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25546");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test25547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25547");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test25548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25548");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        boolean boolean6 = chief2.isVerified();
        double double7 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test25549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25549");
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
        chief2.setVerified(true);
        boolean boolean22 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test25550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25550");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        chief2.logout();
        boolean boolean12 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test25551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25551");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getID();
        chief2.logout();
        chief2.viewProfile();
        chief2.login("hi!", "chief");
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str17 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test25552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25552");
        model.Chief chief2 = new model.Chief("chief", "");
        chief2.logout();
        chief2.logout();
        chief2.login("", "");
        chief2.logout();
        boolean boolean9 = chief2.isVerified();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test25553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25553");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.login("", "chief");
        chief2.login("chief", "hi!");
        chief2.setVerified(true);
        boolean boolean18 = chief2.isVerified();
        boolean boolean19 = chief2.isVerified();
        java.lang.String str20 = chief2.getID();
        java.lang.String str21 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test25554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25554");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        double double5 = chief2.getHourlyRate();
        double double6 = chief2.getHourlyRate();
        chief2.login("", "");
        chief2.login("hi!", "chief");
        java.lang.String str13 = chief2.getPassword();
        chief2.viewProfile();
        chief2.logout();
        chief2.viewProfile();
        double double17 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test25555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25555");
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
        chief2.logout();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25556");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getID();
        java.lang.Class<?> wildcardClass14 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test25557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25557");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        boolean boolean6 = chief2.isVerified();
        chief2.login("", "hi!");
        chief2.login("", "hi!");
        java.lang.String str13 = chief2.getEmail();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test25558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25558");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getAccountType();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getID();
        java.lang.Class<?> wildcardClass11 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test25559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25559");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "chief");
        chief2.login("chief", "hi!");
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getEmail();
        chief2.logout();
        java.lang.String str14 = chief2.getID();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getEmail();
        double double17 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test25560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25560");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.logout();
        java.lang.String str12 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str14 = chief2.getAccountType();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25561");
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
        chief2.logout();
        chief2.logout();
        chief2.logout();
        chief2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25562");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getPassword();
        chief2.logout();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25563");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        boolean boolean11 = chief2.isVerified();
        boolean boolean12 = chief2.isVerified();
        double double13 = chief2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test25564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25564");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str16 = chief2.getPassword();
        java.lang.String str17 = chief2.getAccountType();
        boolean boolean18 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test25565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25565");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test25566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25566");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str12 = chief2.getEmail();
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test25567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25567");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getPassword();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test25568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25568");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25569");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        java.lang.String str11 = chief2.getAccountType();
        chief2.setVerified(true);
        double double14 = chief2.getHourlyRate();
        double double15 = chief2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test25570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25570");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getAccountType();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test25571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25571");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        chief2.logout();
        chief2.login("", "hi!");
        chief2.login("hi!", "hi!");
        java.lang.String str15 = chief2.getEmail();
        chief2.login("", "chief");
        java.lang.String str19 = chief2.getPassword();
        chief2.login("", "chief");
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test25572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25572");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test25573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25573");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getID();
        chief2.login("hi!", "hi!");
        double double13 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test25574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25574");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        chief2.viewProfile();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        chief2.login("chief", "");
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25575");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "");
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
    }

    @Test
    public void test25576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25576");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getPassword();
        chief2.logout();
        chief2.login("chief", "");
        chief2.viewProfile();
        chief2.viewProfile();
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25577");
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
        double double16 = chief2.getHourlyRate();
        boolean boolean17 = chief2.isVerified();
        java.lang.String str18 = chief2.getPassword();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25578");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getPassword();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test25579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25579");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("", "chief");
        java.lang.String str12 = chief2.getAccountType();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getPassword();
        double double15 = chief2.getHourlyRate();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test25580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25580");
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
        boolean boolean14 = chief2.isVerified();
        chief2.setVerified(true);
        chief2.setVerified(true);
        java.lang.String str19 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test25581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25581");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getID();
        boolean boolean11 = chief2.isVerified();
        chief2.setVerified(true);
        chief2.login("", "");
        java.lang.String str17 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test25582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25582");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getAccountType();
        chief2.login("hi!", "");
        java.lang.String str14 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25583");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.logout();
        chief2.login("", "chief");
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getAccountType();
        chief2.login("", "chief");
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25584");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getAccountType();
        chief2.setVerified(false);
        chief2.setVerified(false);
        java.lang.String str17 = chief2.getAccountType();
        chief2.logout();
        boolean boolean19 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test25585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25585");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test25586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25586");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getPassword();
        chief2.login("chief", "");
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test25587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25587");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.viewProfile();
        chief2.login("hi!", "chief");
        chief2.viewProfile();
        boolean boolean10 = chief2.isVerified();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25588");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.login("hi!", "chief");
        java.lang.String str13 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.logout();
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test25589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25589");
        model.Chief chief2 = new model.Chief("chief", "hi!");
        java.lang.String str3 = chief2.getEmail();
        chief2.viewProfile();
        chief2.login("hi!", "");
        chief2.login("chief", "chief");
        java.lang.String str11 = chief2.getAccountType();
        chief2.login("chief", "");
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25590");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(true);
        chief2.viewProfile();
        chief2.login("chief", "");
        chief2.setVerified(true);
        double double19 = chief2.getHourlyRate();
        java.lang.String str20 = chief2.getPassword();
        java.lang.String str21 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test25591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25591");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getPassword();
        boolean boolean13 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25592");
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
        double double18 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str20 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test25593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25593");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        chief2.login("hi!", "chief");
        chief2.login("chief", "chief");
        chief2.login("hi!", "");
        boolean boolean18 = chief2.isVerified();
        java.lang.String str19 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test25594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25594");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        boolean boolean9 = chief2.isVerified();
        chief2.login("hi!", "chief");
        chief2.viewProfile();
        java.lang.String str14 = chief2.getEmail();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getID();
        chief2.login("chief", "hi!");
        java.lang.String str20 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test25595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25595");
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
        chief2.logout();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25596");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        double double5 = chief2.getHourlyRate();
        chief2.logout();
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getPassword();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25597");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.setVerified(true);
        chief2.setVerified(true);
        java.lang.String str15 = chief2.getPassword();
        java.lang.String str16 = chief2.getEmail();
        double double17 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test25598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25598");
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
        chief2.viewProfile();
        java.lang.String str15 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test25599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25599");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getAccountType();
        chief2.setVerified(false);
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getEmail();
        chief2.login("hi!", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test25600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25600");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getAccountType();
        chief2.login("chief", "chief");
        chief2.setVerified(false);
        chief2.login("chief", "");
        java.lang.String str24 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test25601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25601");
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
        chief2.setVerified(false);
        java.lang.String str17 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str22 = chief2.getPassword();
        java.lang.Class<?> wildcardClass23 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test25602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25602");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getEmail();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25603");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getEmail();
        chief2.login("", "chief");
        java.lang.String str13 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test25604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25604");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        chief2.setVerified(true);
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getAccountType();
        chief2.login("chief", "");
        chief2.viewProfile();
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test25605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25605");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.login("hi!", "");
        java.lang.String str10 = chief2.getID();
        chief2.logout();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test25606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25606");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getEmail();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getEmail();
        boolean boolean13 = chief2.isVerified();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test25607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25607");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(false);
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getEmail();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test25608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25608");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getID();
        double double10 = chief2.getHourlyRate();
        chief2.login("", "");
        chief2.setVerified(false);
        java.lang.String str16 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25609");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean8 = chief2.isVerified();
        chief2.login("", "hi!");
        java.lang.String str12 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str15 = chief2.getID();
        java.lang.String str16 = chief2.getAccountType();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25610");
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
        chief2.logout();
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25611");
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
        chief2.setVerified(false);
        double double15 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test25612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25612");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25613");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        chief2.setVerified(false);
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getAccountType();
        boolean boolean13 = chief2.isVerified();
        chief2.logout();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test25614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25614");
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
        java.lang.String str14 = chief2.getEmail();
        chief2.login("chief", "chief");
        chief2.setVerified(true);
        chief2.viewProfile();
        boolean boolean21 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25615");
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
        java.lang.String str21 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
    }

    @Test
    public void test25616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25616");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getPassword();
        chief2.login("hi!", "");
        double double19 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test25617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25617");
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
        chief2.login("", "");
        double double17 = chief2.getHourlyRate();
        java.lang.String str18 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test25618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25618");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getID();
        chief2.setVerified(false);
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getPassword();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25619");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        chief2.logout();
        chief2.login("", "hi!");
        chief2.viewProfile();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getEmail();
        chief2.login("chief", "hi!");
        java.lang.String str18 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test25620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25620");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str6 = chief2.getPassword();
        chief2.login("", "");
        boolean boolean10 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test25621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25621");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.logout();
        double double17 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test25622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25622");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("", "chief");
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getEmail();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test25623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25623");
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
        java.lang.String str13 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.setVerified(false);
        chief2.login("hi!", "hi!");
        java.lang.String str21 = chief2.getID();
        java.lang.String str22 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
    }

    @Test
    public void test25624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25624");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        chief2.login("hi!", "chief");
        chief2.setVerified(false);
        java.lang.String str14 = chief2.getEmail();
        double double15 = chief2.getHourlyRate();
        boolean boolean16 = chief2.isVerified();
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getID();
        double double19 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test25625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25625");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test25626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25626");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getAccountType();
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25627");
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
        boolean boolean15 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test25628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25628");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        chief2.logout();
        chief2.setVerified(true);
        chief2.login("hi!", "");
        java.lang.String str15 = chief2.getAccountType();
        chief2.logout();
        chief2.login("chief", "");
        double double20 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test25629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25629");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str8 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getPassword();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25630");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getID();
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25631");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getPassword();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getID();
        chief2.setVerified(true);
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25632");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getAccountType();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test25633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25633");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
    }

    @Test
    public void test25634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25634");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        double double7 = chief2.getHourlyRate();
        chief2.logout();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test25635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25635");
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
        chief2.login("chief", "chief");
        boolean boolean19 = chief2.isVerified();
        java.lang.String str20 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test25636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25636");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        chief2.viewProfile();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25637");
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
        java.lang.String str19 = chief2.getID();
        java.lang.String str20 = chief2.getAccountType();
        chief2.setVerified(false);
        chief2.login("hi!", "");
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test25638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25638");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.logout();
        chief2.logout();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test25639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25639");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getID();
        chief2.setVerified(false);
        chief2.setVerified(false);
        java.lang.String str14 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25640");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.login("hi!", "hi!");
        chief2.login("", "hi!");
        java.lang.String str15 = chief2.getAccountType();
        chief2.setVerified(true);
        double double18 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test25641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25641");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        chief2.viewProfile();
        double double8 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.viewProfile();
        boolean boolean11 = chief2.isVerified();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test25642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25642");
        model.Chief chief2 = new model.Chief("", "chief");
        double double3 = chief2.getHourlyRate();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getPassword();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        boolean boolean11 = chief2.isVerified();
        chief2.viewProfile();
        chief2.setVerified(true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test25643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25643");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        chief2.logout();
        boolean boolean9 = chief2.isVerified();
        boolean boolean10 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getPassword();
        chief2.login("hi!", "");
        boolean boolean16 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test25644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25644");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean8 = chief2.isVerified();
        double double9 = chief2.getHourlyRate();
        chief2.login("hi!", "chief");
        java.lang.String str13 = chief2.getAccountType();
        chief2.viewProfile();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test25645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25645");
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
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getAccountType();
        java.lang.String str18 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test25646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25646");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test25647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25647");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        boolean boolean8 = chief2.isVerified();
        boolean boolean9 = chief2.isVerified();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str12 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25648");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getPassword();
        chief2.login("", "hi!");
        java.lang.String str13 = chief2.getEmail();
        double double14 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str18 = chief2.getEmail();
        double double19 = chief2.getHourlyRate();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test25649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25649");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        double double12 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str14 = chief2.getPassword();
        double double15 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test25650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25650");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        boolean boolean5 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25651");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getID();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str17 = chief2.getPassword();
        double double18 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test25652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25652");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getPassword();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test25653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25653");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        chief2.login("chief", "chief");
        java.lang.String str11 = chief2.getPassword();
        boolean boolean12 = chief2.isVerified();
        chief2.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test25654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25654");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.login("hi!", "chief");
        chief2.viewProfile();
        java.lang.String str11 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getID();
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25655");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        java.lang.String str14 = chief2.getID();
        chief2.setVerified(true);
        chief2.login("", "hi!");
        java.lang.String str20 = chief2.getPassword();
        chief2.viewProfile();
        boolean boolean22 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test25656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25656");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test25657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25657");
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
        java.lang.String str18 = chief2.getPassword();
        java.lang.String str19 = chief2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test25658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25658");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        double double7 = chief2.getHourlyRate();
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test25659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25659");
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
        chief2.setVerified(true);
        chief2.setVerified(true);
        java.lang.String str23 = chief2.getEmail();
        java.lang.String str24 = chief2.getID();
        java.lang.String str25 = chief2.getPassword();
        java.lang.String str26 = chief2.getID();
        chief2.setVerified(true);
        boolean boolean29 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "chief" + "'", str24, "chief");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "chief" + "'", str26, "chief");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test25660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25660");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.viewProfile();
        chief2.login("", "chief");
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25661");
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
        chief2.login("chief", "hi!");
        java.lang.Class<?> wildcardClass22 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test25662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25662");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getPassword();
        boolean boolean12 = chief2.isVerified();
        chief2.logout();
        double double14 = chief2.getHourlyRate();
        chief2.setVerified(true);
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test25663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25663");
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
        double double17 = chief2.getHourlyRate();
        chief2.login("hi!", "hi!");
        boolean boolean21 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str24 = chief2.getPassword();
        java.lang.String str25 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test25664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25664");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getEmail();
        chief2.login("", "");
        chief2.setVerified(true);
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getEmail();
        chief2.viewProfile();
        double double18 = chief2.getHourlyRate();
        boolean boolean19 = chief2.isVerified();
        java.lang.String str20 = chief2.getID();
        double double21 = chief2.getHourlyRate();
        double double22 = chief2.getHourlyRate();
        java.lang.String str23 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test25665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25665");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.login("chief", "");
        chief2.viewProfile();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test25666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25666");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        boolean boolean9 = chief2.isVerified();
        boolean boolean10 = chief2.isVerified();
        chief2.login("hi!", "chief");
        chief2.setVerified(true);
        boolean boolean16 = chief2.isVerified();
        java.lang.String str17 = chief2.getPassword();
        boolean boolean18 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test25667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25667");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        boolean boolean11 = chief2.isVerified();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test25668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25668");
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
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test25669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25669");
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
        java.lang.String str15 = chief2.getEmail();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test25670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25670");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str11 = chief2.getAccountType();
        chief2.viewProfile();
        boolean boolean13 = chief2.isVerified();
        chief2.logout();
        chief2.login("chief", "hi!");
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test25671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25671");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        java.lang.String str11 = chief2.getID();
        chief2.logout();
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getAccountType();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test25672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25672");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        chief2.logout();
        java.lang.String str8 = chief2.getAccountType();
        chief2.viewProfile();
        double double10 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test25673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25673");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        double double12 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str14 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25674");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        double double5 = chief2.getHourlyRate();
        double double6 = chief2.getHourlyRate();
        chief2.login("", "");
        chief2.login("hi!", "chief");
        java.lang.String str13 = chief2.getPassword();
        chief2.viewProfile();
        chief2.logout();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str18 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test25675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25675");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.logout();
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test25676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25676");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("hi!", "chief");
        double double13 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test25677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25677");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test25678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25678");
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
        chief2.login("chief", "");
        java.lang.String str17 = chief2.getAccountType();
        java.lang.String str18 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test25679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25679");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test25680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25680");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getEmail();
        chief2.logout();
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25681");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "chief");
        java.lang.String str10 = chief2.getAccountType();
        chief2.setVerified(false);
        chief2.setVerified(true);
        chief2.setVerified(true);
        java.lang.String str17 = chief2.getPassword();
        boolean boolean18 = chief2.isVerified();
        chief2.logout();
        boolean boolean20 = chief2.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test25682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25682");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test25683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25683");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str7 = chief2.getEmail();
        chief2.setVerified(true);
        boolean boolean10 = chief2.isVerified();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test25684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25684");
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
        chief2.login("chief", "");
        chief2.viewProfile();
        java.lang.String str18 = chief2.getEmail();
        java.lang.String str19 = chief2.getEmail();
        java.lang.Class<?> wildcardClass20 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test25685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25685");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getEmail();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str18 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test25686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25686");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.logout();
        chief2.login("", "chief");
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test25687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25687");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test25688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25688");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getEmail();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        boolean boolean8 = chief2.isVerified();
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test25689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25689");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.login("", "chief");
        java.lang.String str11 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getAccountType();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25690");
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
        java.lang.String str13 = chief2.getAccountType();
        chief2.setVerified(true);
        double double16 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test25691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25691");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test25692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25692");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.login("", "");
        chief2.setVerified(false);
        chief2.logout();
        chief2.logout();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getID();
        chief2.logout();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25693");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getAccountType();
        double double9 = chief2.getHourlyRate();
        chief2.logout();
        chief2.viewProfile();
        double double12 = chief2.getHourlyRate();
        chief2.setVerified(false);
        double double15 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test25694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25694");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str10 = chief2.getEmail();
        chief2.setVerified(false);
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test25695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25695");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str12 = chief2.getPassword();
        boolean boolean13 = chief2.isVerified();
        chief2.setVerified(true);
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test25696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25696");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.login("chief", "");
        chief2.setVerified(false);
        java.lang.String str14 = chief2.getPassword();
        chief2.viewProfile();
        chief2.viewProfile();
        boolean boolean17 = chief2.isVerified();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test25697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25697");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("hi!", "hi!");
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str17 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test25698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25698");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.login("", "");
        chief2.setVerified(false);
        chief2.logout();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getAccountType();
        chief2.logout();
        double double15 = chief2.getHourlyRate();
        chief2.setVerified(true);
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test25699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25699");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("", "");
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str13 = chief2.getID();
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test25700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25700");
        model.Chief chief2 = new model.Chief("chief", "");
        chief2.setVerified(false);
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getPassword();
        boolean boolean7 = chief2.isVerified();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test25701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25701");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        chief2.setVerified(false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test25702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25702");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getID();
        chief2.logout();
        boolean boolean14 = chief2.isVerified();
        java.lang.String str15 = chief2.getEmail();
        chief2.setVerified(false);
        boolean boolean18 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test25703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25703");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        double double9 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getEmail();
        chief2.logout();
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test25704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25704");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        boolean boolean8 = chief2.isVerified();
        chief2.logout();
        boolean boolean10 = chief2.isVerified();
        double double11 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test25705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25705");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.login("", "");
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25706");
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
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getPassword();
        java.lang.String str18 = chief2.getID();
        chief2.login("hi!", "chief");
        java.lang.String str22 = chief2.getID();
        double double23 = chief2.getHourlyRate();
        java.lang.String str24 = chief2.getAccountType();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "chief" + "'", str24, "chief");
    }

    @Test
    public void test25707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25707");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.logout();
        chief2.login("", "chief");
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test25708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25708");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getID();
        chief2.login("hi!", "");
        java.lang.String str16 = chief2.getEmail();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str19 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test25709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25709");
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
        chief2.viewProfile();
        chief2.logout();
        double double23 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test25710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25710");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        chief2.login("chief", "hi!");
        chief2.viewProfile();
        chief2.login("chief", "chief");
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
    }

    @Test
    public void test25711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25711");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getAccountType();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test25712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25712");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getPassword();
        chief2.logout();
        java.lang.String str10 = chief2.getAccountType();
        chief2.login("hi!", "");
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test25713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25713");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.login("", "");
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getID();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getAccountType();
        chief2.login("hi!", "");
        double double16 = chief2.getHourlyRate();
        java.lang.String str17 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test25714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25714");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        chief2.setVerified(false);
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getPassword();
        boolean boolean14 = chief2.isVerified();
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getID();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25715");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.login("", "");
        java.lang.String str8 = chief2.getEmail();
        chief2.viewProfile();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25716");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        double double7 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(false);
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getID();
        chief2.login("chief", "hi!");
        chief2.logout();
        boolean boolean18 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test25717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25717");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        chief2.login("", "chief");
        chief2.setVerified(false);
        java.lang.String str17 = chief2.getAccountType();
        java.lang.String str18 = chief2.getPassword();
        java.lang.String str19 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test25718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25718");
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
        java.lang.String str19 = chief2.getID();
        boolean boolean20 = chief2.isVerified();
        java.lang.String str21 = chief2.getEmail();
        java.lang.String str22 = chief2.getPassword();
        chief2.viewProfile();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test25719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25719");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getAccountType();
        boolean boolean13 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.login("chief", "hi!");
        java.lang.String str19 = chief2.getID();
        java.lang.String str20 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test25720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25720");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        chief2.login("hi!", "hi!");
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test25721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25721");
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
        chief2.setVerified(true);
        boolean boolean16 = chief2.isVerified();
        java.lang.String str17 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass18 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test25722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25722");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getAccountType();
        chief2.setVerified(false);
        double double11 = chief2.getHourlyRate();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test25723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25723");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        java.lang.String str11 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test25724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25724");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test25725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25725");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25726");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getID();
        double double13 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str16 = chief2.getPassword();
        java.lang.String str17 = chief2.getAccountType();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test25727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25727");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test25728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25728");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.login("chief", "chief");
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25729");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(false);
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25730");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25731");
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
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test25732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25732");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        chief2.login("hi!", "chief");
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str17 = chief2.getID();
        chief2.logout();
        chief2.logout();
        double double20 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test25733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25733");
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
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test25734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25734");
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
        double double17 = chief2.getHourlyRate();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test25735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25735");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getEmail();
        chief2.login("", "");
        java.lang.String str13 = chief2.getAccountType();
        chief2.logout();
        chief2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test25736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25736");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.logout();
        java.lang.String str9 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test25737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25737");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        boolean boolean10 = chief2.isVerified();
        chief2.viewProfile();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25738");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        chief2.login("hi!", "hi!");
        chief2.setVerified(false);
        java.lang.String str13 = chief2.getEmail();
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test25739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25739");
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
        java.lang.String str21 = chief2.getPassword();
        chief2.login("hi!", "hi!");
        java.lang.String str25 = chief2.getAccountType();
        java.lang.String str26 = chief2.getAccountType();
        java.lang.String str27 = chief2.getPassword();
        java.lang.String str28 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "chief" + "'", str25, "chief");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "chief" + "'", str26, "chief");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "chief" + "'", str28, "chief");
    }

    @Test
    public void test25740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25740");
        model.Chief chief2 = new model.Chief("", "chief");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "hi!");
        java.lang.String str8 = chief2.getPassword();
        chief2.login("hi!", "hi!");
        boolean boolean12 = chief2.isVerified();
        chief2.viewProfile();
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25741");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getEmail();
        chief2.viewProfile();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test25742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25742");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        boolean boolean9 = chief2.isVerified();
        boolean boolean10 = chief2.isVerified();
        chief2.login("hi!", "chief");
        chief2.setVerified(true);
        boolean boolean16 = chief2.isVerified();
        java.lang.String str17 = chief2.getPassword();
        chief2.logout();
        java.lang.String str19 = chief2.getAccountType();
        java.lang.String str20 = chief2.getID();
        java.lang.String str21 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
    }

    @Test
    public void test25743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25743");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.login("", "");
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getAccountType();
        chief2.login("chief", "hi!");
        boolean boolean18 = chief2.isVerified();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test25744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25744");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        chief2.login("", "");
        chief2.logout();
        java.lang.String str12 = chief2.getEmail();
        chief2.login("", "chief");
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test25745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25745");
        model.Chief chief2 = new model.Chief("", "hi!");
        double double3 = chief2.getHourlyRate();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        chief2.logout();
        chief2.viewProfile();
        boolean boolean8 = chief2.isVerified();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test25746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25746");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getAccountType();
        chief2.logout();
        chief2.login("", "");
        boolean boolean14 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25747");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test25748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25748");
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
        chief2.logout();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test25749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25749");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getID();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test25750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25750");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.setVerified(true);
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25751");
        model.Chief chief2 = new model.Chief("", "chief");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        chief2.login("", "");
        chief2.setVerified(true);
        chief2.setVerified(false);
        double double18 = chief2.getHourlyRate();
        boolean boolean19 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test25752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25752");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getEmail();
        chief2.viewProfile();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test25753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25753");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(false);
        chief2.login("chief", "hi!");
        double double16 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str18 = chief2.getPassword();
        chief2.logout();
        java.lang.String str20 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test25754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25754");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        chief2.login("chief", "");
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25755");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        java.lang.String str8 = chief2.getPassword();
        chief2.viewProfile();
        chief2.viewProfile();
        chief2.login("", "");
        chief2.logout();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test25756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25756");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getAccountType();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getEmail();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getEmail();
        chief2.viewProfile();
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25757");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str13 = chief2.getPassword();
        boolean boolean14 = chief2.isVerified();
        chief2.logout();
        java.lang.String str16 = chief2.getEmail();
        chief2.viewProfile();
        double double18 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test25758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25758");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25759");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.logout();
        chief2.login("", "chief");
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getPassword();
        chief2.login("hi!", "");
        chief2.login("", "chief");
        java.lang.String str17 = chief2.getEmail();
        chief2.setVerified(false);
        double double20 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test25760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25760");
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
        chief2.logout();
        java.lang.String str17 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test25761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25761");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getAccountType();
        double double10 = chief2.getHourlyRate();
        double double11 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.login("", "hi!");
        boolean boolean16 = chief2.isVerified();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test25762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25762");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25763");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.login("chief", "");
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25764");
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
        chief2.login("hi!", "");
        java.lang.String str22 = chief2.getPassword();
        double double23 = chief2.getHourlyRate();
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test25765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25765");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getEmail();
        chief2.viewProfile();
        chief2.viewProfile();
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test25766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25766");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("chief", "");
        chief2.login("", "chief");
        double double13 = chief2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test25767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25767");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        chief2.setVerified(true);
        boolean boolean9 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getPassword();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25768");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str11 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.viewProfile();
        java.lang.String str15 = chief2.getPassword();
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str21 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test25769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25769");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getPassword();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test25770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25770");
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
        chief2.viewProfile();
        chief2.login("hi!", "");
        java.lang.String str24 = chief2.getID();
        java.lang.String str25 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "chief" + "'", str24, "chief");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "chief" + "'", str25, "chief");
    }

    @Test
    public void test25771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25771");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getEmail();
        chief2.login("hi!", "");
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str19 = chief2.getEmail();
        java.lang.String str20 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test25772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25772");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getPassword();
        chief2.login("chief", "chief");
        chief2.setVerified(true);
        boolean boolean17 = chief2.isVerified();
        double double18 = chief2.getHourlyRate();
        java.lang.String str19 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test25773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25773");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(true);
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getID();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getID();
        chief2.setVerified(false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test25774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25774");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25775");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getPassword();
        chief2.logout();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getEmail();
        double double15 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test25776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25776");
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
        java.lang.String str19 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test25777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25777");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        java.lang.String str8 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str10 = chief2.getPassword();
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test25778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25778");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getID();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getEmail();
        boolean boolean12 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str15 = chief2.getAccountType();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25779");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getPassword();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25780");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        chief2.setVerified(true);
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        chief2.setVerified(true);
        boolean boolean13 = chief2.isVerified();
        chief2.logout();
        java.lang.String str15 = chief2.getEmail();
        chief2.login("chief", "chief");
        java.lang.String str19 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test25781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25781");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.logout();
        chief2.setVerified(false);
        chief2.setVerified(true);
        chief2.logout();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
    }

    @Test
    public void test25782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25782");
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
        double double17 = chief2.getHourlyRate();
        java.lang.String str18 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str21 = chief2.getID();
        java.lang.String str22 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
    }

    @Test
    public void test25783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25783");
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
        java.lang.String str17 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test25784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25784");
        model.Chief chief2 = new model.Chief("", "hi!");
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test25785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25785");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getID();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test25786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25786");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test25787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25787");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getPassword();
        boolean boolean9 = chief2.isVerified();
        chief2.login("chief", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test25788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25788");
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
        boolean boolean16 = chief2.isVerified();
        double double17 = chief2.getHourlyRate();
        java.lang.String str18 = chief2.getEmail();
        java.lang.String str19 = chief2.getEmail();
        double double20 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass21 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test25789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25789");
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
        java.lang.String str14 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25790");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getID();
        chief2.logout();
        java.lang.String str9 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test25791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25791");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        double double5 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getEmail();
        double double13 = chief2.getHourlyRate();
        double double14 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test25792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25792");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.login("", "chief");
        chief2.viewProfile();
        double double12 = chief2.getHourlyRate();
        chief2.login("hi!", "hi!");
        chief2.login("chief", "");
        chief2.logout();
        java.lang.String str20 = chief2.getPassword();
        chief2.setVerified(false);
        double double23 = chief2.getHourlyRate();
        chief2.setVerified(true);
        java.lang.String str26 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "chief" + "'", str26, "chief");
    }

    @Test
    public void test25793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25793");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        chief2.login("chief", "chief");
        java.lang.String str9 = chief2.getAccountType();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getEmail();
        chief2.login("chief", "");
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25794");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        double double8 = chief2.getHourlyRate();
        boolean boolean9 = chief2.isVerified();
        chief2.logout();
        java.lang.Class<?> wildcardClass11 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test25795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25795");
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
        java.lang.String str17 = chief2.getID();
        chief2.setVerified(false);
        double double20 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test25796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25796");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.setVerified(false);
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getEmail();
        chief2.viewProfile();
        chief2.login("", "chief");
        java.lang.String str17 = chief2.getID();
        chief2.logout();
        chief2.setVerified(false);
        double double21 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test25797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25797");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.login("", "");
        double double13 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25798");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        chief2.setVerified(true);
        boolean boolean14 = chief2.isVerified();
        chief2.login("hi!", "chief");
        chief2.login("", "");
        boolean boolean21 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25799");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        chief2.login("chief", "hi!");
        java.lang.String str14 = chief2.getPassword();
        chief2.logout();
        java.lang.String str16 = chief2.getAccountType();
        chief2.setVerified(false);
        chief2.setVerified(true);
        java.lang.Class<?> wildcardClass21 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test25800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25800");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test25801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25801");
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
        chief2.setVerified(false);
        boolean boolean20 = chief2.isVerified();
        java.lang.String str21 = chief2.getID();
        chief2.login("chief", "chief");
        double double25 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass26 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test25802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25802");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        chief2.login("hi!", "");
        chief2.logout();
        chief2.login("hi!", "");
        java.lang.String str16 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25803");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("", "");
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getEmail();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test25804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25804");
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
        chief2.login("hi!", "chief");
        chief2.login("", "hi!");
        chief2.viewProfile();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test25805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25805");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getID();
        boolean boolean10 = chief2.isVerified();
        double double11 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.setVerified(true);
        boolean boolean16 = chief2.isVerified();
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test25806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25806");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.viewProfile();
        chief2.login("", "");
        chief2.login("chief", "chief");
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test25807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25807");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getPassword();
        chief2.login("chief", "");
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25808");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test25809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25809");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getID();
        chief2.logout();
        chief2.setVerified(false);
        chief2.logout();
        chief2.logout();
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25810");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str11 = chief2.getPassword();
        chief2.setVerified(false);
        double double14 = chief2.getHourlyRate();
        boolean boolean15 = chief2.isVerified();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test25811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25811");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getEmail();
        chief2.setVerified(true);
        boolean boolean10 = chief2.isVerified();
        double double11 = chief2.getHourlyRate();
        boolean boolean12 = chief2.isVerified();
        chief2.login("chief", "hi!");
        java.lang.String str16 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25812");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "chief");
        chief2.logout();
        double double11 = chief2.getHourlyRate();
        boolean boolean12 = chief2.isVerified();
        chief2.login("chief", "chief");
        chief2.setVerified(true);
        double double18 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test25813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25813");
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
        java.lang.String str19 = chief2.getID();
        boolean boolean20 = chief2.isVerified();
        java.lang.String str21 = chief2.getEmail();
        double double22 = chief2.getHourlyRate();
        chief2.setVerified(false);
        double double25 = chief2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test25814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25814");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        boolean boolean5 = chief2.isVerified();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(true);
        chief2.setVerified(false);
        chief2.viewProfile();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test25815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25815");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.login("", "chief");
        java.lang.String str13 = chief2.getEmail();
        chief2.login("chief", "");
        chief2.viewProfile();
        double double18 = chief2.getHourlyRate();
        java.lang.String str19 = chief2.getEmail();
        java.lang.String str20 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test25816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25816");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("", "");
        chief2.logout();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getID();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25817");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        java.lang.String str12 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str15 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str17 = chief2.getAccountType();
        java.lang.String str18 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test25818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25818");
        model.Chief chief2 = new model.Chief("", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.Class<?> wildcardClass5 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test25819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25819");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "");
        chief2.login("hi!", "hi!");
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getAccountType();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25820");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "");
        boolean boolean10 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test25821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25821");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str9 = chief2.getID();
        boolean boolean10 = chief2.isVerified();
        chief2.login("", "");
        java.lang.String str14 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test25822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25822");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        boolean boolean5 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test25823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25823");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.setVerified(true);
        double double15 = chief2.getHourlyRate();
        double double16 = chief2.getHourlyRate();
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test25824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25824");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        chief2.setVerified(false);
        double double13 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test25825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25825");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getID();
        chief2.setVerified(true);
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "chief");
        chief2.setVerified(true);
        java.lang.String str18 = chief2.getID();
        java.lang.String str19 = chief2.getID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test25826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25826");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getID();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getID();
        chief2.viewProfile();
        chief2.login("hi!", "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test25827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25827");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25828");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25829");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.login("", "hi!");
        double double10 = chief2.getHourlyRate();
        chief2.login("hi!", "chief");
        java.lang.String str14 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25830");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getPassword();
        double double8 = chief2.getHourlyRate();
        chief2.logout();
        chief2.login("chief", "");
        chief2.setVerified(true);
        double double15 = chief2.getHourlyRate();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test25831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25831");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getEmail();
        chief2.login("hi!", "chief");
        double double14 = chief2.getHourlyRate();
        boolean boolean15 = chief2.isVerified();
        chief2.login("", "");
        chief2.viewProfile();
        chief2.logout();
        java.lang.Class<?> wildcardClass21 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test25832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25832");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getPassword();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25833");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getPassword();
        chief2.setVerified(false);
        boolean boolean15 = chief2.isVerified();
        double double16 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str18 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25834");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass10 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test25835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25835");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(false);
        chief2.login("chief", "chief");
        java.lang.String str17 = chief2.getEmail();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test25836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25836");
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
        chief2.setVerified(true);
        java.lang.String str23 = chief2.getID();
        java.lang.String str24 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "chief" + "'", str23, "chief");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test25837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25837");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test25838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25838");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getPassword();
        boolean boolean9 = chief2.isVerified();
        boolean boolean10 = chief2.isVerified();
        chief2.login("", "");
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test25839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25839");
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
        chief2.login("", "");
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str22 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test25840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25840");
        model.Chief chief2 = new model.Chief("chief", "hi!");
        double double3 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(true);
        chief2.logout();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test25841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25841");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        chief2.setVerified(true);
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test25842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25842");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        java.lang.String str11 = chief2.getID();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25843");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getID();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25844");
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
        chief2.logout();
        chief2.setVerified(false);
        boolean boolean18 = chief2.isVerified();
        java.lang.String str19 = chief2.getAccountType();
        chief2.setVerified(false);
        boolean boolean22 = chief2.isVerified();
        java.lang.String str23 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "chief" + "'", str23, "chief");
    }

    @Test
    public void test25845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25845");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getAccountType();
        boolean boolean14 = chief2.isVerified();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25846");
        model.Chief chief2 = new model.Chief("", "chief");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getAccountType();
        chief2.setVerified(false);
        chief2.viewProfile();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test25847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25847");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getID();
        chief2.login("", "hi!");
        java.lang.String str17 = chief2.getID();
        java.lang.Class<?> wildcardClass18 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test25848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25848");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("", "");
        chief2.setVerified(false);
        chief2.logout();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getAccountType();
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25849");
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
        chief2.setVerified(false);
        java.lang.String str16 = chief2.getID();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25850");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        chief2.login("", "chief");
        chief2.login("", "hi!");
        java.lang.String str15 = chief2.getEmail();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test25851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25851");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        boolean boolean13 = chief2.isVerified();
        boolean boolean14 = chief2.isVerified();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str18 = chief2.getPassword();
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25852");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test25853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25853");
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
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25854");
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
        chief2.viewProfile();
        java.lang.String str15 = chief2.getPassword();
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test25855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25855");
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
        java.lang.String str15 = chief2.getPassword();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25856");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str11 = chief2.getEmail();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25857");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25858");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getEmail();
        chief2.login("hi!", "chief");
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test25859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25859");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.login("", "chief");
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str18 = chief2.getPassword();
        java.lang.String str19 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test25860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25860");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        chief2.logout();
        boolean boolean11 = chief2.isVerified();
        chief2.viewProfile();
        boolean boolean13 = chief2.isVerified();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test25861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25861");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        chief2.login("hi!", "hi!");
        java.lang.String str16 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test25862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25862");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test25863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25863");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getAccountType();
        boolean boolean8 = chief2.isVerified();
        chief2.login("hi!", "hi!");
        double double12 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test25864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25864");
        model.Chief chief2 = new model.Chief("chief", "");
        chief2.logout();
        chief2.login("", "chief");
        chief2.logout();
        java.lang.String str8 = chief2.getPassword();
        chief2.logout();
        java.lang.String str10 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test25865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25865");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getID();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getEmail();
        boolean boolean14 = chief2.isVerified();
        double double15 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test25866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25866");
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
        java.lang.String str19 = chief2.getPassword();
        boolean boolean20 = chief2.isVerified();
        java.lang.String str21 = chief2.getEmail();
        java.lang.Class<?> wildcardClass22 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test25867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25867");
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
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test25868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25868");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.login("", "chief");
        chief2.login("chief", "hi!");
        double double16 = chief2.getHourlyRate();
        java.lang.String str17 = chief2.getAccountType();
        chief2.logout();
        double double19 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass20 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test25869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25869");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getID();
        double double16 = chief2.getHourlyRate();
        java.lang.String str17 = chief2.getEmail();
        boolean boolean18 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test25870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25870");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getID();
        chief2.logout();
        chief2.logout();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test25871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25871");
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
        java.lang.String str19 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("", "");
        java.lang.String str24 = chief2.getID();
        java.lang.String str25 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "chief" + "'", str24, "chief");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "chief" + "'", str25, "chief");
    }

    @Test
    public void test25872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25872");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(false);
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getEmail();
        boolean boolean12 = chief2.isVerified();
        boolean boolean13 = chief2.isVerified();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test25873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25873");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getID();
        chief2.setVerified(false);
        chief2.logout();
        chief2.login("chief", "");
        chief2.setVerified(false);
        java.lang.String str21 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
    }

    @Test
    public void test25874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25874");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.login("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(true);
    }

    @Test
    public void test25875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25875");
        model.Chief chief2 = new model.Chief("chief", "");
        chief2.setVerified(true);
        chief2.setVerified(false);
    }

    @Test
    public void test25876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25876");
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
        chief2.setVerified(true);
        java.lang.String str20 = chief2.getEmail();
        boolean boolean21 = chief2.isVerified();
        chief2.login("", "hi!");
        chief2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25877");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getPassword();
        double double12 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test25878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25878");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        chief2.login("hi!", "hi!");
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test25879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25879");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        boolean boolean9 = chief2.isVerified();
        chief2.logout();
        chief2.login("chief", "hi!");
        java.lang.String str14 = chief2.getID();
        chief2.login("chief", "hi!");
        double double18 = chief2.getHourlyRate();
        java.lang.String str19 = chief2.getAccountType();
        java.lang.String str20 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test25880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25880");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        chief2.viewProfile();
        double double8 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.Class<?> wildcardClass11 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test25881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25881");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getID();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str17 = chief2.getID();
        java.lang.String str18 = chief2.getAccountType();
        java.lang.String str19 = chief2.getPassword();
        java.lang.String str20 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test25882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25882");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getID();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        java.lang.String str11 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test25883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25883");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.login("chief", "chief");
        java.lang.String str11 = chief2.getID();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getEmail();
        chief2.setVerified(false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test25884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25884");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        double double12 = chief2.getHourlyRate();
        chief2.logout();
        chief2.setVerified(false);
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test25885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25885");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getEmail();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getAccountType();
        boolean boolean15 = chief2.isVerified();
        double double16 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test25886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25886");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.login("", "chief");
        java.lang.String str13 = chief2.getEmail();
        boolean boolean14 = chief2.isVerified();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getPassword();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25887");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25888");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str9 = chief2.getID();
        chief2.logout();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test25889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25889");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getID();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25890");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.login("", "");
        java.lang.String str8 = chief2.getEmail();
        boolean boolean9 = chief2.isVerified();
        chief2.login("", "");
        java.lang.String str13 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("hi!", "hi!");
        java.lang.String str18 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test25891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25891");
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
        java.lang.String str17 = chief2.getEmail();
        chief2.logout();
        boolean boolean19 = chief2.isVerified();
        java.lang.String str20 = chief2.getEmail();
        java.lang.String str21 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test25892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25892");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str18 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test25893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25893");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.setVerified(true);
        double double13 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test25894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25894");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.login("chief", "hi!");
        boolean boolean14 = chief2.isVerified();
        chief2.login("hi!", "");
        double double18 = chief2.getHourlyRate();
        java.lang.String str19 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test25895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25895");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getPassword();
        chief2.login("", "");
        chief2.login("", "chief");
        chief2.setVerified(false);
        java.lang.String str14 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str17 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test25896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25896");
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
        chief2.login("", "chief");
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test25897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25897");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        chief2.logout();
        boolean boolean9 = chief2.isVerified();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getPassword();
        chief2.login("chief", "chief");
        chief2.logout();
        double double16 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test25898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25898");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        chief2.logout();
        chief2.login("hi!", "hi!");
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getAccountType();
        chief2.login("", "hi!");
        java.lang.String str14 = chief2.getEmail();
        double double15 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test25899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25899");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getID();
        boolean boolean11 = chief2.isVerified();
        chief2.logout();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test25900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25900");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getAccountType();
        double double6 = chief2.getHourlyRate();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getAccountType();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test25901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25901");
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
        chief2.setVerified(true);
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25902");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        double double10 = chief2.getHourlyRate();
        double double11 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test25903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25903");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getPassword();
        boolean boolean13 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test25904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25904");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        double double10 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getID();
        boolean boolean14 = chief2.isVerified();
        chief2.logout();
        chief2.logout();
        boolean boolean17 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test25905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25905");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str12 = chief2.getPassword();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getEmail();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test25906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25906");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(true);
        boolean boolean11 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test25907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25907");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        chief2.logout();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25908");
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
        java.lang.String str14 = chief2.getEmail();
        chief2.login("chief", "chief");
        java.lang.Class<?> wildcardClass18 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test25909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25909");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        chief2.login("", "hi!");
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getEmail();
        boolean boolean14 = chief2.isVerified();
        double double15 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test25910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25910");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean8 = chief2.isVerified();
        chief2.login("", "hi!");
        java.lang.String str12 = chief2.getAccountType();
        double double13 = chief2.getHourlyRate();
        chief2.logout();
        chief2.setVerified(false);
        boolean boolean17 = chief2.isVerified();
        chief2.logout();
        java.lang.String str19 = chief2.getEmail();
        java.lang.String str20 = chief2.getID();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test25911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25911");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(false);
        double double13 = chief2.getHourlyRate();
        chief2.login("", "hi!");
        double double17 = chief2.getHourlyRate();
        chief2.logout();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test25912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25912");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        boolean boolean6 = chief2.isVerified();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        chief2.login("chief", "chief");
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test25913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25913");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25914");
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
        java.lang.String str17 = chief2.getEmail();
        chief2.login("", "");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test25915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25915");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.logout();
        boolean boolean5 = chief2.isVerified();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test25916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25916");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getAccountType();
        boolean boolean12 = chief2.isVerified();
        chief2.viewProfile();
        boolean boolean14 = chief2.isVerified();
        chief2.setVerified(true);
        chief2.login("chief", "");
        java.lang.String str20 = chief2.getID();
        java.lang.String str21 = chief2.getAccountType();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
    }

    @Test
    public void test25917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25917");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getAccountType();
        chief2.logout();
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str14 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test25918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25918");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.logout();
        chief2.login("", "chief");
        java.lang.String str7 = chief2.getEmail();
        double double8 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test25919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25919");
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
        boolean boolean14 = chief2.isVerified();
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25920");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.viewProfile();
        java.lang.String str14 = chief2.getEmail();
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getPassword();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test25921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25921");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        double double11 = chief2.getHourlyRate();
        double double12 = chief2.getHourlyRate();
        double double13 = chief2.getHourlyRate();
        chief2.login("", "hi!");
        java.lang.String str17 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test25922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25922");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str12 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test25923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25923");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.login("hi!", "");
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25924");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        chief2.setVerified(true);
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getPassword();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25925");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        double double5 = chief2.getHourlyRate();
        double double6 = chief2.getHourlyRate();
        chief2.login("", "");
        chief2.login("hi!", "chief");
        java.lang.String str13 = chief2.getPassword();
        chief2.viewProfile();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25926");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        chief2.logout();
        boolean boolean9 = chief2.isVerified();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getPassword();
        chief2.logout();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25927");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getEmail();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getAccountType();
        chief2.login("", "hi!");
        chief2.logout();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test25928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25928");
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
        java.lang.String str16 = chief2.getEmail();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test25929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25929");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getPassword();
        double double8 = chief2.getHourlyRate();
        chief2.setVerified(true);
        boolean boolean11 = chief2.isVerified();
        chief2.logout();
        java.lang.String str13 = chief2.getAccountType();
        boolean boolean14 = chief2.isVerified();
        double double15 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test25930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25930");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        chief2.login("hi!", "hi!");
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        chief2.viewProfile();
        double double12 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test25931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25931");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean8 = chief2.isVerified();
        chief2.login("", "hi!");
        java.lang.String str12 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.viewProfile();
        java.lang.String str16 = chief2.getEmail();
        boolean boolean17 = chief2.isVerified();
        double double18 = chief2.getHourlyRate();
        double double19 = chief2.getHourlyRate();
        double double20 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test25932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25932");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getAccountType();
        boolean boolean9 = chief2.isVerified();
        chief2.setVerified(true);
        boolean boolean12 = chief2.isVerified();
        double double13 = chief2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test25933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25933");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.login("", "chief");
        chief2.login("chief", "hi!");
        double double16 = chief2.getHourlyRate();
        java.lang.String str17 = chief2.getAccountType();
        java.lang.String str18 = chief2.getPassword();
        java.lang.String str19 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test25934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25934");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getAccountType();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test25935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25935");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str15 = chief2.getPassword();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test25936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25936");
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
        chief2.login("", "hi!");
        chief2.login("", "chief");
        chief2.login("chief", "");
        boolean boolean23 = chief2.isVerified();
        java.lang.String str24 = chief2.getAccountType();
        java.lang.String str25 = chief2.getAccountType();
        java.lang.String str26 = chief2.getEmail();
        boolean boolean27 = chief2.isVerified();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "chief" + "'", str24, "chief");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "chief" + "'", str25, "chief");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test25937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25937");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getAccountType();
        double double15 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str17 = chief2.getID();
        chief2.login("", "");
        java.lang.String str21 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
    }

    @Test
    public void test25938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25938");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getID();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getID();
        chief2.viewProfile();
        chief2.login("chief", "hi!");
        java.lang.String str20 = chief2.getID();
        java.lang.String str21 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
    }

    @Test
    public void test25939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25939");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getID();
        chief2.logout();
        java.lang.String str10 = chief2.getEmail();
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25940");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getID();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25941");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getEmail();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getID();
        java.lang.String str16 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test25942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25942");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        chief2.logout();
        chief2.login("hi!", "hi!");
        java.lang.String str15 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str19 = chief2.getAccountType();
        boolean boolean20 = chief2.isVerified();
        chief2.login("", "");
        boolean boolean24 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test25943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25943");
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
        chief2.logout();
        java.lang.String str14 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        java.lang.String str19 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test25944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25944");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test25945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25945");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test25946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25946");
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
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str18 = chief2.getAccountType();
        java.lang.String str19 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test25947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25947");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test25948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25948");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("", "");
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
    }

    @Test
    public void test25949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25949");
        model.Chief chief2 = new model.Chief("", "chief");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getEmail();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25950");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test25951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25951");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        chief2.login("", "");
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test25952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25952");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.login("chief", "");
        java.lang.String str11 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getPassword();
        double double18 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test25953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25953");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.login("hi!", "hi!");
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test25954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25954");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25955");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        chief2.viewProfile();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str16 = chief2.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25956");
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
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getEmail();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test25957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25957");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        chief2.viewProfile();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        chief2.login("chief", "");
        chief2.viewProfile();
        chief2.login("", "");
        chief2.viewProfile();
        java.lang.String str17 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test25958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25958");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.login("hi!", "hi!");
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test25959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25959");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getID();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test25960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25960");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        boolean boolean14 = chief2.isVerified();
        java.lang.String str15 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str18 = chief2.getEmail();
        java.lang.String str19 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test25961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25961");
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
        double double14 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.setVerified(true);
        java.lang.String str19 = chief2.getPassword();
        java.lang.String str20 = chief2.getEmail();
        chief2.logout();
        java.lang.String str22 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test25962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25962");
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
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25963");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        double double5 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.viewProfile();
        double double9 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str11 = chief2.getPassword();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test25964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25964");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getEmail();
        double double11 = chief2.getHourlyRate();
        chief2.logout();
        double double13 = chief2.getHourlyRate();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test25965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25965");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        chief2.viewProfile();
        chief2.logout();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getEmail();
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test25966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25966");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        double double8 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str10 = chief2.getID();
        chief2.setVerified(true);
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test25967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25967");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        double double12 = chief2.getHourlyRate();
        chief2.login("chief", "chief");
        java.lang.String str16 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str19 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str22 = chief2.getID();
        boolean boolean23 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test25968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25968");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getAccountType();
        boolean boolean12 = chief2.isVerified();
        boolean boolean13 = chief2.isVerified();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test25969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25969");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getEmail();
        chief2.login("", "");
        chief2.setVerified(true);
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str18 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test25970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25970");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test25971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25971");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.logout();
        chief2.logout();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str10 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test25972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25972");
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
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test25973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25973");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        chief2.viewProfile();
        double double9 = chief2.getHourlyRate();
        double double10 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test25974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25974");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str7 = chief2.getPassword();
        chief2.login("hi!", "hi!");
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getEmail();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test25975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25975");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.Class<?> wildcardClass11 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test25976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25976");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test25977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25977");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getAccountType();
        double double6 = chief2.getHourlyRate();
        chief2.setVerified(true);
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getAccountType();
        chief2.login("", "hi!");
        boolean boolean14 = chief2.isVerified();
        chief2.login("", "hi!");
        double double18 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test25978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25978");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        boolean boolean5 = chief2.isVerified();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test25979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25979");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        chief2.login("chief", "");
        chief2.logout();
        double double12 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getAccountType();
        double double15 = chief2.getHourlyRate();
        double double16 = chief2.getHourlyRate();
        double double17 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test25980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25980");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getID();
        chief2.setVerified(false);
        chief2.setVerified(false);
        chief2.viewProfile();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test25981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25981");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test25982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25982");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getEmail();
        chief2.viewProfile();
        double double15 = chief2.getHourlyRate();
        chief2.logout();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test25983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25983");
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
        chief2.login("chief", "chief");
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test25984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25984");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test25985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25985");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        chief2.viewProfile();
        chief2.logout();
        chief2.viewProfile();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test25986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25986");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getPassword();
        boolean boolean7 = chief2.isVerified();
        java.lang.String str8 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test25987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25987");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.login("chief", "chief");
        boolean boolean10 = chief2.isVerified();
        boolean boolean11 = chief2.isVerified();
        chief2.setVerified(true);
        chief2.login("chief", "hi!");
        double double17 = chief2.getHourlyRate();
        chief2.setVerified(true);
        double double20 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test25988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25988");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getID();
        chief2.logout();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getID();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test25989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25989");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        chief2.login("hi!", "");
        java.lang.String str12 = chief2.getID();
        chief2.login("", "");
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test25990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25990");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.setVerified(true);
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test25991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25991");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        chief2.setVerified(true);
        chief2.login("chief", "chief");
        chief2.logout();
        chief2.setVerified(false);
    }

    @Test
    public void test25992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25992");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getAccountType();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        chief2.login("", "hi!");
        chief2.viewProfile();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test25993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25993");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        boolean boolean9 = chief2.isVerified();
        chief2.viewProfile();
        chief2.login("chief", "chief");
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getID();
        chief2.setVerified(true);
        java.lang.Class<?> wildcardClass18 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test25994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25994");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getAccountType();
        double double7 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.Class<?> wildcardClass10 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test25995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25995");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.logout();
        chief2.login("", "chief");
        java.lang.String str12 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str14 = chief2.getEmail();
        chief2.login("chief", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test25996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25996");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test25997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25997");
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
        chief2.login("chief", "");
        boolean boolean17 = chief2.isVerified();
        java.lang.String str18 = chief2.getPassword();
        java.lang.String str19 = chief2.getEmail();
        java.lang.String str20 = chief2.getEmail();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test25998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25998");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getPassword();
        chief2.logout();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25999");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        boolean boolean4 = chief2.isVerified();
        chief2.login("hi!", "hi!");
        chief2.logout();
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test26000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test26000");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getPassword();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getPassword();
        java.lang.Class<?> wildcardClass14 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

