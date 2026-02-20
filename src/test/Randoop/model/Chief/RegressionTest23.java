import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

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
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11501");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getEmail();
        chief2.login("", "");
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getID();
        chief2.logout();
        java.lang.String str10 = chief2.getEmail();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
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
        chief2.viewProfile();
        java.lang.String str16 = chief2.getID();
        chief2.logout();
        java.lang.String str18 = chief2.getEmail();
        java.lang.String str19 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str22 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
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
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getID();
        boolean boolean12 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        boolean boolean7 = chief2.isVerified();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getEmail();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        double double11 = chief2.getHourlyRate();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
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
        chief2.login("chief", "");
        chief2.login("hi!", "");
        chief2.setVerified(true);
        chief2.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getAccountType();
        chief2.setVerified(false);
        chief2.login("chief", "");
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
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
        java.lang.String str15 = chief2.getAccountType();
        boolean boolean16 = chief2.isVerified();
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getID();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getID();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getID();
        chief2.setVerified(true);
        chief2.viewProfile();
        chief2.setVerified(true);
        boolean boolean18 = chief2.isVerified();
        java.lang.Class<?> wildcardClass19 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getID();
        double double10 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.login("chief", "chief");
        java.lang.String str11 = chief2.getID();
        double double12 = chief2.getHourlyRate();
        double double13 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        chief2.logout();
        double double12 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getAccountType();
        chief2.logout();
        chief2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str11 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str14 = chief2.getPassword();
        chief2.viewProfile();
        double double16 = chief2.getHourlyRate();
        chief2.login("hi!", "chief");
        chief2.viewProfile();
        boolean boolean21 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getEmail();
        chief2.login("chief", "");
        boolean boolean9 = chief2.isVerified();
        chief2.logout();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getID();
        double double13 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str6 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.login("chief", "chief");
        chief2.setVerified(false);
        chief2.setVerified(true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getEmail();
        chief2.login("hi!", "chief");
        boolean boolean9 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
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
        chief2.login("", "chief");
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.login("chief", "chief");
        boolean boolean10 = chief2.isVerified();
        chief2.logout();
        java.lang.String str12 = chief2.getPassword();
        chief2.logout();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
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
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getAccountType();
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "chief");
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getID();
        double double13 = chief2.getHourlyRate();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getAccountType();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
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
        chief2.viewProfile();
        java.lang.String str17 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str11 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getAccountType();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getEmail();
        java.lang.String str19 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.login("", "");
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getPassword();
        java.lang.String str17 = chief2.getAccountType();
        chief2.login("", "hi!");
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        double double5 = chief2.getHourlyRate();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(false);
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
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
        chief2.setVerified(true);
        boolean boolean15 = chief2.isVerified();
        chief2.viewProfile();
        double double17 = chief2.getHourlyRate();
        double double18 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass19 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
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
        chief2.logout();
        chief2.setVerified(true);
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        double double11 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str14 = chief2.getID();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
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
        chief2.login("", "chief");
        java.lang.String str20 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str11 = chief2.getID();
        chief2.logout();
        double double13 = chief2.getHourlyRate();
        chief2.viewProfile();
        boolean boolean15 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.setVerified(true);
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getEmail();
        chief2.viewProfile();
        double double13 = chief2.getHourlyRate();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getPassword();
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
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
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        chief2.viewProfile();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        java.lang.String str9 = chief2.getID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
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
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
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
        chief2.login("chief", "hi!");
        java.lang.String str21 = chief2.getAccountType();
        chief2.login("hi!", "");
        chief2.login("hi!", "hi!");
        java.lang.String str28 = chief2.getEmail();
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
        model.Chief chief2 = new model.Chief("", "chief");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getEmail();
        chief2.login("", "hi!");
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        chief2.login("", "chief");
        double double14 = chief2.getHourlyRate();
        double double15 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getEmail();
        chief2.logout();
        chief2.logout();
        java.lang.String str11 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.logout();
        boolean boolean4 = chief2.isVerified();
        chief2.viewProfile();
        chief2.login("hi!", "hi!");
        chief2.logout();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getID();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str9 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getEmail();
        boolean boolean15 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getPassword();
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getID();
        boolean boolean14 = chief2.isVerified();
        chief2.logout();
        boolean boolean16 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getAccountType();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getID();
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getPassword();
        java.lang.String str17 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean8 = chief2.isVerified();
        double double9 = chief2.getHourlyRate();
        chief2.login("hi!", "chief");
        java.lang.String str13 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getEmail();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
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
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getEmail();
        chief2.setVerified(false);
        boolean boolean17 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
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
        chief2.login("hi!", "");
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        chief2.logout();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getEmail();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(false);
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getID();
        chief2.login("chief", "");
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getPassword();
        chief2.logout();
        java.lang.String str10 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
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
        java.lang.String str17 = chief2.getPassword();
        java.lang.String str18 = chief2.getPassword();
        java.lang.String str19 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        chief2.login("hi!", "chief");
        chief2.login("hi!", "chief");
        chief2.logout();
        java.lang.String str16 = chief2.getPassword();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str21 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getPassword();
        chief2.viewProfile();
        double double13 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.viewProfile();
        boolean boolean16 = chief2.isVerified();
        chief2.login("hi!", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        chief2.login("", "chief");
        chief2.login("", "");
        boolean boolean13 = chief2.isVerified();
        boolean boolean14 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getAccountType();
        boolean boolean12 = chief2.isVerified();
        double double13 = chief2.getHourlyRate();
        double double14 = chief2.getHourlyRate();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getAccountType();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        chief2.viewProfile();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        chief2.login("chief", "");
        double double12 = chief2.getHourlyRate();
        chief2.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str9 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getPassword();
        boolean boolean12 = chief2.isVerified();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.viewProfile();
        chief2.viewProfile();
        chief2.logout();
        boolean boolean11 = chief2.isVerified();
        chief2.login("", "chief");
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        double double12 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11571");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getEmail();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getID();
        chief2.setVerified(true);
        double double18 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11572");
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
        chief2.logout();
        java.lang.String str16 = chief2.getAccountType();
        chief2.login("hi!", "");
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11573");
        model.Chief chief2 = new model.Chief("", "hi!");
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getEmail();
        boolean boolean9 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11574");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getEmail();
        java.lang.String str5 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.login("", "");
        chief2.logout();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getAccountType();
        chief2.setVerified(false);
        double double16 = chief2.getHourlyRate();
        java.lang.String str17 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11575");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        chief2.logout();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        chief2.setVerified(true);
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getPassword();
        boolean boolean13 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11576");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        boolean boolean14 = chief2.isVerified();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11577");
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
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11578");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.login("", "chief");
        java.lang.String str12 = chief2.getEmail();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getPassword();
        boolean boolean16 = chief2.isVerified();
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11579");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("", "");
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11580");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getPassword();
        chief2.login("", "hi!");
        chief2.logout();
        boolean boolean14 = chief2.isVerified();
        java.lang.String str15 = chief2.getAccountType();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11581");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getPassword();
        chief2.logout();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getAccountType();
        chief2.login("chief", "");
        chief2.logout();
        boolean boolean16 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11582");
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
        java.lang.String str19 = chief2.getEmail();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11583");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getEmail();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        chief2.logout();
        chief2.login("", "chief");
        boolean boolean16 = chief2.isVerified();
        java.lang.String str17 = chief2.getAccountType();
        java.lang.String str18 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11584");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        double double5 = chief2.getHourlyRate();
        chief2.setVerified(false);
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11585");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getEmail();
        double double10 = chief2.getHourlyRate();
        double double11 = chief2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11586");
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
        boolean boolean13 = chief2.isVerified();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11587");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getAccountType();
        double double6 = chief2.getHourlyRate();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getAccountType();
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11588");
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
        double double17 = chief2.getHourlyRate();
        chief2.login("chief", "hi!");
        java.lang.String str21 = chief2.getAccountType();
        java.lang.String str22 = chief2.getEmail();
        chief2.login("chief", "");
        java.lang.String str26 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "chief" + "'", str26, "chief");
    }

    @Test
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11589");
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
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str19 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11590");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("", "hi!");
        java.lang.String str11 = chief2.getPassword();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11591");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getEmail();
        java.lang.String str5 = chief2.getAccountType();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11592");
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
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11593");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        chief2.login("hi!", "hi!");
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.Class<?> wildcardClass18 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11594");
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
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getID();
        boolean boolean17 = chief2.isVerified();
        chief2.login("chief", "");
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11595");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getEmail();
        java.lang.String str5 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.login("", "");
        chief2.setVerified(true);
        chief2.login("hi!", "");
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11596");
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
        double double17 = chief2.getHourlyRate();
        java.lang.String str18 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test11597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11597");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("", "");
        chief2.login("", "chief");
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getPassword();
        chief2.login("hi!", "");
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11598");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        double double12 = chief2.getHourlyRate();
        chief2.login("", "hi!");
        boolean boolean16 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11599");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11600");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        double double11 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11601");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        double double4 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        double double8 = chief2.getHourlyRate();
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test11602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11602");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "hi!");
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(true);
        chief2.viewProfile();
        double double16 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test11603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11603");
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
        java.lang.String str18 = chief2.getEmail();
        double double19 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test11604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11604");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getID();
        chief2.logout();
        java.lang.String str12 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11605");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getPassword();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(false);
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11606");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        chief2.logout();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str16 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11607");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.viewProfile();
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test11608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11608");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getEmail();
        boolean boolean13 = chief2.isVerified();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11609");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11610");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getID();
        chief2.logout();
        chief2.logout();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11611");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11612");
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
        java.lang.String str15 = chief2.getPassword();
        java.lang.String str16 = chief2.getPassword();
        chief2.login("", "chief");
        java.lang.String str20 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test11613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11613");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11614");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getAccountType();
        double double8 = chief2.getHourlyRate();
        chief2.logout();
        double double10 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11615");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        chief2.setVerified(true);
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getID();
        chief2.setVerified(true);
        chief2.login("chief", "hi!");
        boolean boolean18 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test11616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11616");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getAccountType();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getAccountType();
        double double12 = chief2.getHourlyRate();
        double double13 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test11617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11617");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str9 = chief2.getID();
        chief2.logout();
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test11618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11618");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getPassword();
        chief2.logout();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11619");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str10 = chief2.getEmail();
        double double11 = chief2.getHourlyRate();
        chief2.login("hi!", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test11620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11620");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getAccountType();
        boolean boolean9 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.logout();
        chief2.login("", "chief");
        chief2.login("hi!", "");
        java.lang.String str19 = chief2.getEmail();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11621");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getAccountType();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11622");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        double double7 = chief2.getHourlyRate();
        chief2.setVerified(true);
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test11623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11623");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        chief2.logout();
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test11624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11624");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getPassword();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getAccountType();
        boolean boolean9 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getEmail();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test11625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11625");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        double double11 = chief2.getHourlyRate();
        chief2.login("", "hi!");
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test11626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11626");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getEmail();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test11627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11627");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getPassword();
        chief2.login("", "hi!");
        java.lang.String str13 = chief2.getEmail();
        chief2.logout();
        java.lang.String str15 = chief2.getID();
        java.lang.String str16 = chief2.getAccountType();
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test11628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11628");
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
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getID();
        chief2.login("", "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11629");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getID();
        chief2.login("hi!", "hi!");
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test11630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11630");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.logout();
        chief2.setVerified(false);
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getPassword();
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11631");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11632");
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
        chief2.viewProfile();
        java.lang.String str15 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11633");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.login("chief", "");
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getAccountType();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test11634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11634");
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
        java.lang.String str12 = chief2.getAccountType();
        chief2.logout();
        double double14 = chief2.getHourlyRate();
        boolean boolean15 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11635");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getID();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str18 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test11636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11636");
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
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11637");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getEmail();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11638");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getID();
        chief2.logout();
        java.lang.String str12 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11639");
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
        java.lang.String str21 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str23 = chief2.getAccountType();
        double double24 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str26 = chief2.getPassword();
        java.lang.Class<?> wildcardClass27 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "chief" + "'", str23, "chief");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test11640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11640");
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
        java.lang.String str18 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test11641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11641");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.setVerified(false);
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str11 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test11642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11642");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        double double5 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getEmail();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11643");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getEmail();
        java.lang.Class<?> wildcardClass11 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11644");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getEmail();
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11645");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(true);
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test11646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11646");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("", "");
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str13 = chief2.getID();
        chief2.login("hi!", "chief");
        double double17 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test11647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11647");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getEmail();
        double double11 = chief2.getHourlyRate();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getID();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11648");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.login("", "");
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getEmail();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getEmail();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11649");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean12 = chief2.isVerified();
        chief2.viewProfile();
        chief2.login("", "");
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11650");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getEmail();
        java.lang.Class<?> wildcardClass11 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11651");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str6 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11652");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getAccountType();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.login("", "chief");
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11653");
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
        java.lang.String str15 = chief2.getID();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11654");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.setVerified(true);
        chief2.setVerified(true);
        chief2.setVerified(true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
    }

    @Test
    public void test11655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11655");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getAccountType();
        java.lang.String str6 = chief2.getAccountType();
        chief2.login("hi!", "");
        chief2.setVerified(false);
        boolean boolean12 = chief2.isVerified();
        double double13 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test11656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11656");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(true);
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getEmail();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getPassword();
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11657");
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
        chief2.logout();
        chief2.login("hi!", "chief");
        java.lang.String str21 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test11658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11658");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        chief2.logout();
        java.lang.String str12 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getAccountType();
        chief2.viewProfile();
        boolean boolean19 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test11659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11659");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.login("hi!", "");
        double double12 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test11660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11660");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.login("", "chief");
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        boolean boolean13 = chief2.isVerified();
        chief2.login("", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11661");
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
        boolean boolean12 = chief2.isVerified();
        chief2.login("chief", "");
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11662");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        chief2.logout();
        java.lang.Class<?> wildcardClass7 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11663");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getID();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test11664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11664");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.login("", "");
        chief2.setVerified(false);
        chief2.logout();
        double double12 = chief2.getHourlyRate();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11665");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getPassword();
        chief2.login("hi!", "chief");
        chief2.logout();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11666");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getPassword();
        chief2.login("hi!", "");
        boolean boolean13 = chief2.isVerified();
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11667");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getAccountType();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getAccountType();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test11668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11668");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getID();
        double double10 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getID();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test11669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11669");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        double double12 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test11670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11670");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        double double8 = chief2.getHourlyRate();
        chief2.viewProfile();
        boolean boolean10 = chief2.isVerified();
        chief2.login("", "");
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test11671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11671");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getEmail();
        chief2.login("hi!", "");
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getPassword();
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11672");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        java.lang.String str11 = chief2.getEmail();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11673");
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
        chief2.logout();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11674");
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
        chief2.setVerified(false);
        java.lang.String str17 = chief2.getPassword();
        java.lang.String str18 = chief2.getID();
        boolean boolean19 = chief2.isVerified();
        boolean boolean20 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11675");
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
        chief2.setVerified(false);
        java.lang.String str22 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
    }

    @Test
    public void test11676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11676");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getEmail();
        double double5 = chief2.getHourlyRate();
        chief2.viewProfile();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test11677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11677");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.login("", "chief");
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test11678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11678");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test11679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11679");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11680");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        double double12 = chief2.getHourlyRate();
        double double13 = chief2.getHourlyRate();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test11681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11681");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "chief");
        java.lang.String str10 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str13 = chief2.getAccountType();
        boolean boolean14 = chief2.isVerified();
        boolean boolean15 = chief2.isVerified();
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11682");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getAccountType();
        java.lang.String str6 = chief2.getAccountType();
        chief2.login("hi!", "");
        java.lang.String str10 = chief2.getID();
        boolean boolean11 = chief2.isVerified();
        double double12 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test11683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11683");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getEmail();
        boolean boolean11 = chief2.isVerified();
        chief2.login("chief", "");
        java.lang.String str15 = chief2.getID();
        java.lang.String str16 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11684");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getEmail();
        chief2.login("", "chief");
        java.lang.String str15 = chief2.getPassword();
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getID();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test11685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11685");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.login("hi!", "");
        java.lang.String str16 = chief2.getAccountType();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test11686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11686");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.login("hi!", "hi!");
        chief2.setVerified(true);
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11687");
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
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11688");
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
        java.lang.String str16 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test11689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11689");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        chief2.setVerified(true);
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getID();
        chief2.viewProfile();
        chief2.login("chief", "hi!");
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11690");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        boolean boolean10 = chief2.isVerified();
        chief2.viewProfile();
        chief2.logout();
        double double13 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11691");
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
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11692");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(true);
        chief2.viewProfile();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11693");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getID();
        chief2.setVerified(true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11694");
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
        java.lang.String str21 = chief2.getEmail();
        java.lang.String str22 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
    }

    @Test
    public void test11695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11695");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test11696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11696");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        boolean boolean9 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11697");
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
        double double18 = chief2.getHourlyRate();
        boolean boolean19 = chief2.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11698");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("chief", "hi!");
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getEmail();
        chief2.login("", "");
        boolean boolean16 = chief2.isVerified();
        java.lang.String str17 = chief2.getAccountType();
        java.lang.String str18 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test11699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11699");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getID();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11700");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test11701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11701");
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
        java.lang.String str16 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("", "chief");
        java.lang.Class<?> wildcardClass21 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11702");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(false);
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getID();
        chief2.login("chief", "");
        boolean boolean15 = chief2.isVerified();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11703");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
    }

    @Test
    public void test11704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11704");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(false);
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11705");
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
        chief2.login("", "");
        chief2.viewProfile();
        java.lang.String str19 = chief2.getPassword();
        java.lang.Class<?> wildcardClass20 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11706");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        double double9 = chief2.getHourlyRate();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getPassword();
        chief2.viewProfile();
        double double13 = chief2.getHourlyRate();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test11707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11707");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.login("hi!", "");
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str13 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11708");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getEmail();
        double double5 = chief2.getHourlyRate();
        chief2.viewProfile();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11709");
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
        java.lang.String str15 = chief2.getEmail();
        chief2.login("chief", "hi!");
        chief2.login("", "chief");
        chief2.viewProfile();
        java.lang.String str23 = chief2.getPassword();
        java.lang.String str24 = chief2.getEmail();
        java.lang.String str25 = chief2.getAccountType();
        boolean boolean26 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "chief" + "'", str25, "chief");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test11710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11710");
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
        java.lang.String str14 = chief2.getAccountType();
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getID();
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11711");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getPassword();
        boolean boolean6 = chief2.isVerified();
        boolean boolean7 = chief2.isVerified();
        chief2.login("chief", "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11712");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getEmail();
        chief2.login("", "hi!");
        chief2.viewProfile();
        java.lang.String str14 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11713");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getAccountType();
        boolean boolean9 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getAccountType();
        chief2.logout();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test11714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11714");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getEmail();
        double double16 = chief2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test11715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11715");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        double double5 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getEmail();
        java.lang.Class<?> wildcardClass10 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11716");
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
        boolean boolean17 = chief2.isVerified();
        boolean boolean18 = chief2.isVerified();
        java.lang.String str19 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11717");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.login("hi!", "");
        java.lang.String str10 = chief2.getID();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11718");
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
        java.lang.String str15 = chief2.getAccountType();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11719");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getAccountType();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        java.lang.String str11 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11720");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        chief2.login("hi!", "hi!");
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("hi!", "hi!");
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11721");
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
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getPassword();
        java.lang.String str17 = chief2.getAccountType();
        java.lang.String str18 = chief2.getEmail();
        java.lang.String str19 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11722");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str9 = chief2.getID();
        chief2.logout();
        double double11 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getAccountType();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test11723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11723");
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
        chief2.viewProfile();
        java.lang.String str16 = chief2.getEmail();
        boolean boolean17 = chief2.isVerified();
        chief2.login("hi!", "");
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11724");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.login("", "");
        chief2.viewProfile();
        java.lang.String str17 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11725");
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
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11726");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test11727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11727");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getEmail();
        double double5 = chief2.getHourlyRate();
        chief2.viewProfile();
        boolean boolean7 = chief2.isVerified();
        boolean boolean8 = chief2.isVerified();
        chief2.viewProfile();
        double double10 = chief2.getHourlyRate();
        double double11 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test11728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11728");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getEmail();
        double double5 = chief2.getHourlyRate();
        chief2.viewProfile();
        boolean boolean7 = chief2.isVerified();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11729");
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
        java.lang.String str15 = chief2.getAccountType();
        double double16 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str19 = chief2.getID();
        java.lang.Class<?> wildcardClass20 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11730");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.login("", "");
        chief2.setVerified(false);
        chief2.logout();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11731");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11732");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "");
        boolean boolean10 = chief2.isVerified();
        boolean boolean11 = chief2.isVerified();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11733");
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
        double double25 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass26 = chief2.getClass();
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test11734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11734");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str10 = chief2.getPassword();
        chief2.login("", "hi!");
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test11735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11735");
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
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11736");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getPassword();
        chief2.setVerified(true);
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11737");
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
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11738");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        java.lang.String str10 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11739");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        double double8 = chief2.getHourlyRate();
        boolean boolean9 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11740");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        double double11 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test11741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11741");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getID();
        chief2.logout();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getID();
        chief2.setVerified(true);
        boolean boolean16 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test11742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11742");
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
        boolean boolean14 = chief2.isVerified();
        chief2.login("hi!", "");
        java.lang.String str18 = chief2.getID();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test11743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11743");
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
        java.lang.String str21 = chief2.getID();
        double double22 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test11744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11744");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean12 = chief2.isVerified();
        chief2.viewProfile();
        chief2.login("", "chief");
        java.lang.String str17 = chief2.getID();
        java.lang.String str18 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11745");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        chief2.setVerified(true);
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getPassword();
        double double12 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test11746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11746");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getAccountType();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getID();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test11747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11747");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.login("", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getAccountType();
        chief2.setVerified(true);
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11748");
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
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11749");
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
        java.lang.Class<?> wildcardClass25 = chief2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test11750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11750");
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
        chief2.login("chief", "chief");
        java.lang.String str19 = chief2.getPassword();
        java.lang.String str20 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test11751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11751");
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
        chief2.viewProfile();
        boolean boolean16 = chief2.isVerified();
        java.lang.String str17 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11752");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.login("chief", "chief");
        chief2.setVerified(false);
        boolean boolean13 = chief2.isVerified();
        boolean boolean14 = chief2.isVerified();
        chief2.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11753");
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
        java.lang.String str14 = chief2.getAccountType();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11754");
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
        chief2.logout();
        boolean boolean16 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str18 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test11755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11755");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getPassword();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11756");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11757");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        chief2.viewProfile();
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test11758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11758");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("hi!", "hi!");
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getEmail();
        chief2.logout();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11759");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getID();
        chief2.login("", "hi!");
        chief2.viewProfile();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getID();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getEmail();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11760");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        double double5 = chief2.getHourlyRate();
        chief2.login("", "chief");
        double double9 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11761");
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
        java.lang.String str18 = chief2.getEmail();
        java.lang.String str19 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11762");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getID();
        chief2.logout();
        chief2.logout();
        chief2.login("hi!", "hi!");
        java.lang.String str16 = chief2.getAccountType();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test11763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11763");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("", "");
        chief2.login("hi!", "chief");
        java.lang.String str14 = chief2.getEmail();
        chief2.logout();
        chief2.login("", "");
        java.lang.Class<?> wildcardClass19 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11764");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test11765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11765");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getID();
        chief2.login("", "chief");
        boolean boolean14 = chief2.isVerified();
        boolean boolean15 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11766");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test11767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11767");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        boolean boolean10 = chief2.isVerified();
        chief2.setVerified(true);
        double double13 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test11768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11768");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.setVerified(true);
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getPassword();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11769");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11770");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getID();
        chief2.viewProfile();
        double double10 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getEmail();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11771");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("", "chief");
        chief2.logout();
        chief2.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
    }

    @Test
    public void test11772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11772");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getPassword();
        chief2.login("", "");
        double double9 = chief2.getHourlyRate();
        chief2.logout();
        chief2.setVerified(true);
        chief2.setVerified(true);
        double double15 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test11773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11773");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getAccountType();
        double double10 = chief2.getHourlyRate();
        chief2.login("", "chief");
        chief2.login("", "hi!");
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test11774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11774");
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
        chief2.viewProfile();
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
    public void test11775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11775");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        boolean boolean10 = chief2.isVerified();
        chief2.setVerified(true);
        chief2.setVerified(true);
        chief2.login("chief", "hi!");
        java.lang.String str18 = chief2.getPassword();
        java.lang.String str19 = chief2.getPassword();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11776");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test11777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11777");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.login("", "chief");
        chief2.login("chief", "hi!");
        chief2.viewProfile();
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11778");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        boolean boolean10 = chief2.isVerified();
        chief2.login("chief", "chief");
        double double14 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test11779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11779");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        chief2.login("hi!", "hi!");
        chief2.setVerified(true);
        java.lang.String str17 = chief2.getEmail();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11780");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getEmail();
        chief2.login("hi!", "chief");
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str14 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11781");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getAccountType();
        boolean boolean9 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getAccountType();
        double double13 = chief2.getHourlyRate();
        boolean boolean14 = chief2.isVerified();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11782");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        chief2.logout();
        boolean boolean9 = chief2.isVerified();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str15 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str18 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test11783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11783");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("chief", "hi!");
        java.lang.String str11 = chief2.getID();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11784");
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
        chief2.login("chief", "");
        double double20 = chief2.getHourlyRate();
        double double21 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test11785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11785");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getID();
        chief2.viewProfile();
        double double9 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test11786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11786");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.login("chief", "");
        java.lang.String str11 = chief2.getID();
        chief2.logout();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11787");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        chief2.login("hi!", "hi!");
        double double11 = chief2.getHourlyRate();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11788");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        boolean boolean5 = chief2.isVerified();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test11789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11789");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getEmail();
        chief2.viewProfile();
        boolean boolean13 = chief2.isVerified();
        chief2.logout();
        chief2.login("", "hi!");
        java.lang.String str18 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11790");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getID();
        chief2.login("chief", "");
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getID();
        java.lang.String str18 = chief2.getEmail();
        java.lang.String str19 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test11791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11791");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getPassword();
        boolean boolean12 = chief2.isVerified();
        chief2.login("chief", "");
        java.lang.String str16 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11792");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getID();
        java.lang.Class<?> wildcardClass9 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11793");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test11794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11794");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getEmail();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11795");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getEmail();
        boolean boolean12 = chief2.isVerified();
        boolean boolean13 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str16 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test11796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11796");
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
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getPassword();
        double double16 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test11797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11797");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        java.lang.String str8 = chief2.getPassword();
        chief2.login("chief", "chief");
        chief2.login("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.login("hi!", "");
        java.lang.Class<?> wildcardClass21 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11798");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getEmail();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getID();
        chief2.login("chief", "chief");
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11799");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getPassword();
        boolean boolean13 = chief2.isVerified();
        chief2.logout();
        double double15 = chief2.getHourlyRate();
        double double16 = chief2.getHourlyRate();
        java.lang.String str17 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test11800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11800");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.logout();
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11801");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("hi!", "hi!");
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11802");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        chief2.login("chief", "chief");
        java.lang.String str9 = chief2.getAccountType();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getID();
        double double14 = chief2.getHourlyRate();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test11803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11803");
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
        java.lang.String str15 = chief2.getPassword();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11804");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getPassword();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        chief2.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test11805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11805");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        chief2.logout();
        java.lang.String str8 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test11806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11806");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        chief2.login("hi!", "hi!");
        java.lang.String str11 = chief2.getID();
        chief2.logout();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11807");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        chief2.login("hi!", "hi!");
        chief2.viewProfile();
        chief2.setVerified(true);
        boolean boolean18 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str21 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test11808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11808");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getEmail();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        double double12 = chief2.getHourlyRate();
        chief2.logout();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test11809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11809");
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
        chief2.viewProfile();
        chief2.login("chief", "chief");
        java.lang.String str19 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test11810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11810");
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
        chief2.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11811");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        chief2.login("", "chief");
        chief2.login("", "");
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11812");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        double double4 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        chief2.logout();
        chief2.login("chief", "chief");
        java.lang.Class<?> wildcardClass11 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11813");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getEmail();
        java.lang.String str5 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11814");
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
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11815");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("chief", "hi!");
        java.lang.String str11 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getAccountType();
        double double14 = chief2.getHourlyRate();
        boolean boolean15 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11816");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str9 = chief2.getID();
        boolean boolean10 = chief2.isVerified();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11817");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean8 = chief2.isVerified();
        chief2.logout();
        java.lang.String str10 = chief2.getPassword();
        boolean boolean11 = chief2.isVerified();
        chief2.setVerified(false);
        boolean boolean14 = chief2.isVerified();
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11818");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getPassword();
        java.lang.Class<?> wildcardClass7 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11819");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str9 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getEmail();
        double double13 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11820");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.login("hi!", "hi!");
        java.lang.String str12 = chief2.getID();
        chief2.logout();
        java.lang.String str14 = chief2.getID();
        boolean boolean15 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11821");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        chief2.logout();
        chief2.logout();
        java.lang.String str8 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11822");
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
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test11823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11823");
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
        chief2.login("chief", "hi!");
        java.lang.String str17 = chief2.getAccountType();
        java.lang.String str18 = chief2.getAccountType();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test11824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11824");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        chief2.logout();
        chief2.logout();
        java.lang.String str13 = chief2.getEmail();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11825");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getEmail();
        java.lang.String str5 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.login("", "");
        chief2.setVerified(true);
        chief2.setVerified(false);
        java.lang.String str15 = chief2.getPassword();
        boolean boolean16 = chief2.isVerified();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11826");
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
        double double16 = chief2.getHourlyRate();
        java.lang.String str17 = chief2.getAccountType();
        double double18 = chief2.getHourlyRate();
        boolean boolean19 = chief2.isVerified();
        java.lang.String str20 = chief2.getPassword();
        java.lang.String str21 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test11827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11827");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str13 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test11828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11828");
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
        chief2.setVerified(true);
        double double27 = chief2.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test11829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11829");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getID();
        chief2.logout();
        chief2.logout();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11830");
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
        double double16 = chief2.getHourlyRate();
        java.lang.String str17 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test11831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11831");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.login("", "");
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getID();
        chief2.logout();
        chief2.logout();
        chief2.logout();
        boolean boolean16 = chief2.isVerified();
        java.lang.String str17 = chief2.getEmail();
        java.lang.Class<?> wildcardClass18 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11832");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        java.lang.Class<?> wildcardClass7 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11833");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.viewProfile();
        chief2.logout();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11834");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getID();
        chief2.setVerified(true);
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test11835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11835");
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
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str17 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11836");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getEmail();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getPassword();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11837");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getAccountType();
        chief2.setVerified(true);
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getID();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test11838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11838");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.logout();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getID();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11839");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getEmail();
        chief2.setVerified(false);
        boolean boolean14 = chief2.isVerified();
        chief2.viewProfile();
        chief2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11840");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getEmail();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test11841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11841");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.setVerified(true);
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test11842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11842");
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
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11843");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getEmail();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11844");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getAccountType();
        boolean boolean12 = chief2.isVerified();
        chief2.logout();
        boolean boolean14 = chief2.isVerified();
        double double15 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test11845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11845");
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
        double double19 = chief2.getHourlyRate();
        chief2.setVerified(true);
        java.lang.String str22 = chief2.getAccountType();
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
    }

    @Test
    public void test11846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11846");
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
        java.lang.String str14 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11847");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        boolean boolean5 = chief2.isVerified();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test11848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11848");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        chief2.login("chief", "");
        chief2.logout();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getID();
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test11849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11849");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11850");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.login("", "");
        chief2.viewProfile();
        java.lang.String str17 = chief2.getEmail();
        double double18 = chief2.getHourlyRate();
        java.lang.String str19 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11851");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getEmail();
        java.lang.String str5 = chief2.getAccountType();
        boolean boolean6 = chief2.isVerified();
        boolean boolean7 = chief2.isVerified();
        boolean boolean8 = chief2.isVerified();
        chief2.login("chief", "");
        java.lang.String str12 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11852");
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
        chief2.setVerified(false);
        double double18 = chief2.getHourlyRate();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test11853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11853");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.logout();
        chief2.setVerified(false);
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test11854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11854");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        chief2.viewProfile();
        chief2.viewProfile();
    }

    @Test
    public void test11855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11855");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        double double11 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test11856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11856");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        double double8 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test11857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11857");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        chief2.login("hi!", "");
        double double14 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str18 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test11858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11858");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.login("", "chief");
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getPassword();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11859");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.login("chief", "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11860");
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
        java.lang.String str16 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str19 = chief2.getPassword();
        java.lang.String str20 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test11861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11861");
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
        boolean boolean13 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11862");
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
        chief2.login("hi!", "");
        double double20 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test11863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11863");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        boolean boolean12 = chief2.isVerified();
        chief2.login("", "chief");
        java.lang.String str16 = chief2.getEmail();
        double double17 = chief2.getHourlyRate();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test11864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11864");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        double double5 = chief2.getHourlyRate();
        double double6 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str10 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11865");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.login("chief", "hi!");
        java.lang.String str11 = chief2.getPassword();
        double double12 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test11866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11866");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getPassword();
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11867");
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
        java.lang.String str22 = chief2.getEmail();
        java.lang.String str23 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "chief" + "'", str23, "chief");
    }

    @Test
    public void test11868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11868");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "chief");
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getID();
        boolean boolean12 = chief2.isVerified();
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str16 = chief2.getAccountType();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test11869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11869");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        chief2.viewProfile();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.login("hi!", "chief");
        double double13 = chief2.getHourlyRate();
        chief2.login("chief", "hi!");
        chief2.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test11870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11870");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("", "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test11871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11871");
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
        java.lang.String str15 = chief2.getEmail();
        chief2.logout();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11872");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        boolean boolean8 = chief2.isVerified();
        chief2.login("", "");
        chief2.login("", "");
        chief2.login("chief", "");
        chief2.logout();
        boolean boolean19 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11873");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        java.lang.String str7 = chief2.getAccountType();
        double double8 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test11874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11874");
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
        double double13 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test11875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11875");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getPassword();
        double double11 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test11876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11876");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11877");
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
        chief2.logout();
        chief2.logout();
        chief2.login("", "hi!");
        java.lang.String str23 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test11878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11878");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getAccountType();
        chief2.setVerified(false);
        chief2.logout();
        chief2.login("chief", "chief");
        java.lang.String str17 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test11879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11879");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getID();
        java.lang.Class<?> wildcardClass8 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11880");
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
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11881");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        chief2.logout();
        java.lang.String str7 = chief2.getPassword();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str10 = chief2.getID();
        double double11 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test11882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11882");
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
        chief2.logout();
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
    }

    @Test
    public void test11883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11883");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getPassword();
        chief2.setVerified(true);
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        chief2.logout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test11884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11884");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        boolean boolean5 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11885");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "");
        boolean boolean10 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11886");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        boolean boolean10 = chief2.isVerified();
        chief2.setVerified(true);
        boolean boolean13 = chief2.isVerified();
        chief2.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11887");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        boolean boolean8 = chief2.isVerified();
        chief2.login("", "");
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11888");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        chief2.logout();
        java.lang.String str10 = chief2.getAccountType();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test11889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11889");
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
        boolean boolean17 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test11890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11890");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getEmail();
        chief2.setVerified(false);
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11891");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        chief2.logout();
        chief2.viewProfile();
        chief2.login("chief", "hi!");
        boolean boolean16 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11892");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        boolean boolean12 = chief2.isVerified();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test11893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11893");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        chief2.viewProfile();
        boolean boolean10 = chief2.isVerified();
        chief2.viewProfile();
        boolean boolean12 = chief2.isVerified();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getPassword();
        double double15 = chief2.getHourlyRate();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test11894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11894");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11895");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getID();
        chief2.login("", "chief");
        boolean boolean14 = chief2.isVerified();
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11896");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test11897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11897");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        double double9 = chief2.getHourlyRate();
        chief2.login("chief", "hi!");
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11898");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getPassword();
        chief2.login("", "");
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getPassword();
        java.lang.Class<?> wildcardClass11 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11899");
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
        chief2.viewProfile();
        chief2.login("", "chief");
        boolean boolean19 = chief2.isVerified();
        double double20 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test11900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11900");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.login("", "chief");
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11901");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getPassword();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        chief2.viewProfile();
        double double10 = chief2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test11902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11902");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getID();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11903");
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
        java.lang.String str14 = chief2.getPassword();
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11904");
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
        chief2.viewProfile();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11905");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str6 = chief2.getEmail();
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getAccountType();
        chief2.login("", "chief");
        chief2.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test11906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11906");
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
        chief2.login("chief", "chief");
        chief2.viewProfile();
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11907");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        chief2.logout();
        boolean boolean7 = chief2.isVerified();
        chief2.viewProfile();
        chief2.logout();
        double double10 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test11908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11908");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        chief2.logout();
        java.lang.String str10 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11909");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        chief2.logout();
        java.lang.String str12 = chief2.getEmail();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test11910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11910");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "chief");
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getID();
        double double13 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str16 = chief2.getEmail();
        chief2.logout();
        java.lang.String str18 = chief2.getAccountType();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test11911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11911");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.setVerified(true);
        boolean boolean10 = chief2.isVerified();
        chief2.setVerified(true);
        double double13 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test11912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11912");
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
        boolean boolean13 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11913");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getPassword();
        chief2.setVerified(false);
        boolean boolean15 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11914");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        boolean boolean9 = chief2.isVerified();
        boolean boolean10 = chief2.isVerified();
        chief2.logout();
        java.lang.String str12 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11915");
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
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getEmail();
        boolean boolean17 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11916");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getPassword();
        chief2.login("chief", "hi!");
        java.lang.String str13 = chief2.getEmail();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11917");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.login("chief", "hi!");
        boolean boolean14 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str17 = chief2.getPassword();
        boolean boolean18 = chief2.isVerified();
        java.lang.String str19 = chief2.getEmail();
        chief2.login("hi!", "hi!");
        java.lang.String str23 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "chief" + "'", str23, "chief");
    }

    @Test
    public void test11918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11918");
        model.Chief chief2 = new model.Chief("", "hi!");
        double double3 = chief2.getHourlyRate();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getAccountType();
        chief2.login("", "");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test11919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11919");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        chief2.logout();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getID();
        chief2.setVerified(true);
        double double16 = chief2.getHourlyRate();
        java.lang.String str17 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test11920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11920");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        double double5 = chief2.getHourlyRate();
        chief2.login("", "chief");
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getPassword();
        chief2.logout();
        chief2.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11921");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getAccountType();
        double double11 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass14 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11922");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getEmail();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getID();
        chief2.logout();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11923");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("hi!", "hi!");
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11924");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        double double3 = chief2.getHourlyRate();
        boolean boolean4 = chief2.isVerified();
        chief2.viewProfile();
        double double6 = chief2.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11925");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.login("chief", "");
        java.lang.String str12 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11926");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        chief2.login("chief", "");
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getAccountType();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test11927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11927");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        chief2.setVerified(true);
        boolean boolean9 = chief2.isVerified();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str12 = chief2.getAccountType();
        chief2.login("", "");
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test11928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11928");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str9 = chief2.getID();
        chief2.login("chief", "chief");
        chief2.setVerified(false);
        java.lang.String str15 = chief2.getID();
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test11929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11929");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        boolean boolean10 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getAccountType();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getID();
        boolean boolean15 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11930");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("", "");
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getEmail();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test11931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11931");
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
        java.lang.String str15 = chief2.getAccountType();
        double double16 = chief2.getHourlyRate();
        chief2.setVerified(false);
        boolean boolean19 = chief2.isVerified();
        java.lang.String str20 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test11932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11932");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getEmail();
        boolean boolean11 = chief2.isVerified();
        boolean boolean12 = chief2.isVerified();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getID();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11933");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        java.lang.Class<?> wildcardClass10 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11934");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        boolean boolean11 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str14 = chief2.getID();
        chief2.logout();
        boolean boolean16 = chief2.isVerified();
        boolean boolean17 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11935");
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
        java.lang.String str18 = chief2.getEmail();
        boolean boolean19 = chief2.isVerified();
        double double20 = chief2.getHourlyRate();
        double double21 = chief2.getHourlyRate();
        boolean boolean22 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test11936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11936");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        boolean boolean7 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test11937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11937");
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
        chief2.setVerified(false);
        double double20 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test11938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11938");
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
        chief2.setVerified(false);
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11939");
        model.Chief chief2 = new model.Chief("chief", "hi!");
        double double3 = chief2.getHourlyRate();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "chief");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test11940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11940");
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
        chief2.logout();
        chief2.login("chief", "");
        double double18 = chief2.getHourlyRate();
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test11941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11941");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.setVerified(false);
        chief2.logout();
        chief2.viewProfile();
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11942");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getAccountType();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test11943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11943");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getPassword();
        double double6 = chief2.getHourlyRate();
        double double7 = chief2.getHourlyRate();
        chief2.viewProfile();
        double double9 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str11 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11944");
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
        double double16 = chief2.getHourlyRate();
        boolean boolean17 = chief2.isVerified();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11945");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        java.lang.String str8 = chief2.getAccountType();
        chief2.logout();
        chief2.logout();
        chief2.viewProfile();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11946");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        chief2.viewProfile();
        boolean boolean9 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getEmail();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11947");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11948");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(true);
        chief2.setVerified(false);
        chief2.logout();
        chief2.setVerified(true);
        java.lang.String str13 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11949");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.login("chief", "");
        chief2.viewProfile();
        java.lang.String str12 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.setVerified(true);
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11950");
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
        chief2.viewProfile();
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11951");
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
        chief2.login("chief", "hi!");
        java.lang.String str18 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str20 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.viewProfile();
        java.lang.String str25 = chief2.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test11952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11952");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getEmail();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11953");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getID();
        chief2.login("chief", "");
        java.lang.String str16 = chief2.getAccountType();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test11954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11954");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        boolean boolean10 = chief2.isVerified();
        chief2.viewProfile();
        chief2.logout();
        boolean boolean13 = chief2.isVerified();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test11955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11955");
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
        java.lang.String str14 = chief2.getID();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11956");
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
        java.lang.String str16 = chief2.getPassword();
        chief2.logout();
        java.lang.String str18 = chief2.getAccountType();
        java.lang.String str19 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11957");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.logout();
        chief2.login("chief", "");
        chief2.login("hi!", "hi!");
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.setVerified(true);
        java.lang.String str18 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11958");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str10 = chief2.getID();
        boolean boolean11 = chief2.isVerified();
        double double12 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str14 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11959");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getEmail();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        chief2.setVerified(false);
        chief2.viewProfile();
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test11960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11960");
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
        boolean boolean16 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11961");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.login("", "");
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11962");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getID();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getID();
        double double13 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test11963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11963");
        model.Chief chief2 = new model.Chief("", "hi!");
        chief2.logout();
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getEmail();
        boolean boolean8 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11964");
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
        chief2.login("hi!", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11965");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        double double11 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test11966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11966");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        chief2.logout();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getAccountType();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test11967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11967");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        chief2.login("", "");
        chief2.login("hi!", "chief");
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test11968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11968");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        chief2.logout();
        chief2.login("", "");
        java.lang.String str12 = chief2.getEmail();
        boolean boolean13 = chief2.isVerified();
        chief2.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11969");
        model.Chief chief2 = new model.Chief("hi!", "chief");
        double double3 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "");
        chief2.viewProfile();
        java.lang.String str11 = chief2.getAccountType();
        double double12 = chief2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test11970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11970");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        chief2.login("chief", "");
        chief2.logout();
        double double12 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11971");
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
        double double17 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test11972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11972");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getAccountType();
        chief2.viewProfile();
        double double11 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.Class<?> wildcardClass14 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11973");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11974");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str8 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11975");
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
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.logout();
        boolean boolean17 = chief2.isVerified();
        java.lang.String str18 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test11976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11976");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        boolean boolean6 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getID();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getPassword();
        chief2.login("", "");
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test11977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11977");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getAccountType();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getID();
        chief2.login("", "chief");
        java.lang.String str11 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test11978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11978");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test11979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11979");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getAccountType();
        double double6 = chief2.getHourlyRate();
        chief2.setVerified(true);
        boolean boolean9 = chief2.isVerified();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11980");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getPassword();
        chief2.logout();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test11981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11981");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.login("hi!", "");
        java.lang.String str16 = chief2.getID();
        chief2.login("", "chief");
        java.lang.String str20 = chief2.getEmail();
        java.lang.String str21 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
    }

    @Test
    public void test11982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11982");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11983");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        chief2.login("hi!", "hi!");
        chief2.viewProfile();
        chief2.login("chief", "");
        chief2.setVerified(true);
        java.lang.String str16 = chief2.getPassword();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11984");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        boolean boolean14 = chief2.isVerified();
        java.lang.String str15 = chief2.getPassword();
        double double16 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str20 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test11985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11985");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str10 = chief2.getPassword();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass14 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11986");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.login("chief", "chief");
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getAccountType();
        double double13 = chief2.getHourlyRate();
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11987");
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
        java.lang.String str19 = chief2.getEmail();
        double double20 = chief2.getHourlyRate();
        java.lang.String str21 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test11988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11988");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        chief2.login("chief", "hi!");
        java.lang.String str13 = chief2.getID();
        java.lang.Class<?> wildcardClass14 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11989");
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
        chief2.login("hi!", "hi!");
        chief2.viewProfile();
        java.lang.String str22 = chief2.getID();
        java.lang.String str23 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "chief" + "'", str22, "chief");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "chief" + "'", str23, "chief");
    }

    @Test
    public void test11990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11990");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getAccountType();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test11991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11991");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        chief2.viewProfile();
        chief2.login("", "hi!");
        chief2.login("chief", "hi!");
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11992");
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
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11993");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11994");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getID();
        double double11 = chief2.getHourlyRate();
        boolean boolean12 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11995");
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
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test11996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11996");
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
        chief2.viewProfile();
        java.lang.String str16 = chief2.getEmail();
        boolean boolean17 = chief2.isVerified();
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11997");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getID();
        boolean boolean11 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test11998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11998");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test11999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11999");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.login("chief", "");
        double double10 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.setVerified(false);
        double double15 = chief2.getHourlyRate();
        chief2.setVerified(false);
        boolean boolean18 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test12000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test12000");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.login("hi!", "");
        java.lang.String str6 = chief2.getPassword();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }
}

