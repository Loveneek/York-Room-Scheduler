import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest55 {

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
    public void test27501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27501");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test27502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27502");
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
        chief2.login("chief", "chief");
        java.lang.String str16 = chief2.getEmail();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test27503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27503");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        chief2.login("hi!", "hi!");
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test27504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27504");
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
        double double14 = chief2.getHourlyRate();
        chief2.login("", "chief");
        java.lang.String str18 = chief2.getPassword();
        chief2.logout();
        boolean boolean20 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test27505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27505");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getEmail();
        boolean boolean11 = chief2.isVerified();
        boolean boolean12 = chief2.isVerified();
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getID();
        java.lang.String str16 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test27506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27506");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        java.lang.Class<?> wildcardClass11 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test27507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27507");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        chief2.setVerified(true);
        chief2.login("", "");
        java.lang.String str13 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getID();
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test27508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27508");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test27509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27509");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test27510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27510");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.viewProfile();
        java.lang.String str11 = chief2.getID();
        double double12 = chief2.getHourlyRate();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test27511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27511");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str12 = chief2.getAccountType();
        double double13 = chief2.getHourlyRate();
        double double14 = chief2.getHourlyRate();
        chief2.logout();
        chief2.logout();
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test27512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27512");
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
        java.lang.String str15 = chief2.getEmail();
        chief2.login("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        boolean boolean22 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test27513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27513");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("chief", "hi!");
        chief2.login("hi!", "hi!");
        chief2.login("chief", "chief");
        java.lang.String str17 = chief2.getID();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test27514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27514");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        chief2.login("chief", "chief");
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str14 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test27515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27515");
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
        java.lang.String str15 = chief2.getID();
        boolean boolean16 = chief2.isVerified();
        chief2.login("chief", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test27516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27516");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.login("hi!", "hi!");
        chief2.setVerified(false);
        java.lang.String str16 = chief2.getPassword();
        boolean boolean17 = chief2.isVerified();
        java.lang.String str18 = chief2.getEmail();
        java.lang.String str19 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test27517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27517");
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
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test27518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27518");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass10 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test27519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27519");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getEmail();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test27520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27520");
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
        java.lang.String str14 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test27521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27521");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        double double13 = chief2.getHourlyRate();
        boolean boolean14 = chief2.isVerified();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test27522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27522");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        double double4 = chief2.getHourlyRate();
        boolean boolean5 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getID();
        chief2.login("chief", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
    }

    @Test
    public void test27523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27523");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.login("", "chief");
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.logout();
        chief2.setVerified(false);
        chief2.logout();
        boolean boolean19 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test27524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27524");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.login("chief", "hi!");
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test27525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27525");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.login("", "");
        java.lang.String str8 = chief2.getEmail();
        chief2.viewProfile();
        boolean boolean10 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test27526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27526");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test27527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27527");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getPassword();
        boolean boolean11 = chief2.isVerified();
        double double12 = chief2.getHourlyRate();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test27528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27528");
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
        chief2.setVerified(true);
        java.lang.String str16 = chief2.getEmail();
        chief2.setVerified(true);
        boolean boolean19 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test27529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27529");
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
        chief2.login("", "chief");
        java.lang.String str23 = chief2.getPassword();
        chief2.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test27530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27530");
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
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getID();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test27531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27531");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test27532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27532");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        chief2.logout();
        chief2.logout();
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test27533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27533");
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
        java.lang.String str19 = chief2.getID();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test27534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27534");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test27535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27535");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.logout();
        boolean boolean5 = chief2.isVerified();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.login("", "hi!");
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test27536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27536");
        model.Chief chief2 = new model.Chief("", "hi!");
        double double3 = chief2.getHourlyRate();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.login("hi!", "hi!");
        java.lang.String str10 = chief2.getAccountType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test27537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27537");
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
        java.lang.String str14 = chief2.getPassword();
        boolean boolean15 = chief2.isVerified();
        chief2.viewProfile();
        chief2.viewProfile();
        chief2.login("", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test27538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27538");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.login("", "");
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getEmail();
        chief2.viewProfile();
        double double12 = chief2.getHourlyRate();
        double double13 = chief2.getHourlyRate();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test27539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27539");
        model.Chief chief2 = new model.Chief("", "");
        java.lang.String str3 = chief2.getAccountType();
        boolean boolean4 = chief2.isVerified();
        java.lang.String str5 = chief2.getAccountType();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("chief", "chief");
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getEmail();
        chief2.viewProfile();
        boolean boolean14 = chief2.isVerified();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test27540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27540");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        java.lang.String str8 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getEmail();
        boolean boolean13 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test27541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27541");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        boolean boolean10 = chief2.isVerified();
        chief2.setVerified(true);
        chief2.setVerified(true);
        boolean boolean15 = chief2.isVerified();
        double double16 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test27542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27542");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getPassword();
        chief2.login("chief", "hi!");
        chief2.login("hi!", "");
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test27543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27543");
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
        chief2.logout();
        double double25 = chief2.getHourlyRate();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test27544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27544");
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
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getAccountType();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test27545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27545");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        java.lang.Class<?> wildcardClass7 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test27546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27546");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getAccountType();
        double double8 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test27547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27547");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.setVerified(false);
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str15 = chief2.getID();
        chief2.logout();
        boolean boolean17 = chief2.isVerified();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test27548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27548");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        chief2.logout();
        chief2.setVerified(true);
        chief2.setVerified(false);
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getEmail();
        double double15 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test27549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27549");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        double double10 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str14 = chief2.getEmail();
        chief2.login("", "hi!");
        java.lang.Class<?> wildcardClass18 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test27550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27550");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        java.lang.String str9 = chief2.getEmail();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getID();
        chief2.login("", "chief");
        boolean boolean15 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test27551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27551");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getEmail();
        java.lang.String str5 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.login("", "");
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getEmail();
        double double13 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test27552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27552");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        chief2.login("hi!", "");
        java.lang.String str11 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test27553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27553");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test27554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27554");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getEmail();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test27555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27555");
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
        java.lang.Class<?> wildcardClass24 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test27556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27556");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getEmail();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test27557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27557");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test27558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27558");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str9 = chief2.getAccountType();
        chief2.setVerified(false);
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getID();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test27559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27559");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getAccountType();
        chief2.login("hi!", "");
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test27560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27560");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        chief2.logout();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        chief2.setVerified(true);
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getEmail();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test27561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27561");
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
        chief2.login("chief", "chief");
        java.lang.String str18 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test27562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27562");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        chief2.viewProfile();
        double double8 = chief2.getHourlyRate();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test27563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27563");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str8 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getEmail();
        chief2.logout();
        boolean boolean13 = chief2.isVerified();
        chief2.login("", "chief");
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test27564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27564");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.login("", "");
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test27565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27565");
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
        double double18 = chief2.getHourlyRate();
        java.lang.String str19 = chief2.getAccountType();
        boolean boolean20 = chief2.isVerified();
        java.lang.String str21 = chief2.getPassword();
        boolean boolean22 = chief2.isVerified();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test27566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27566");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getEmail();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getAccountType();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test27567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27567");
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
        java.lang.String str13 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test27568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27568");
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
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getEmail();
        double double16 = chief2.getHourlyRate();
        java.lang.String str17 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test27569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27569");
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
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test27570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27570");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean8 = chief2.isVerified();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getID();
        chief2.viewProfile();
        boolean boolean12 = chief2.isVerified();
        boolean boolean13 = chief2.isVerified();
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test27571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27571");
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
        chief2.login("hi!", "chief");
        java.lang.String str20 = chief2.getPassword();
        java.lang.String str21 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str23 = chief2.getAccountType();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "chief" + "'", str23, "chief");
    }

    @Test
    public void test27572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27572");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getEmail();
        double double5 = chief2.getHourlyRate();
        chief2.viewProfile();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test27573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27573");
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
        chief2.login("", "hi!");
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test27574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27574");
        model.Chief chief2 = new model.Chief("", "chief");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getAccountType();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getAccountType();
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test27575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27575");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        chief2.login("chief", "chief");
        boolean boolean10 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test27576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27576");
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
        java.lang.String str19 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test27577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27577");
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
        chief2.login("", "chief");
        chief2.viewProfile();
        java.lang.String str19 = chief2.getID();
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test27578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27578");
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
        chief2.setVerified(true);
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getEmail();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test27579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27579");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        double double7 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getPassword();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test27580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27580");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getID();
        chief2.login("", "chief");
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test27581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27581");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test27582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27582");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        double double12 = chief2.getHourlyRate();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getEmail();
        chief2.logout();
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test27583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27583");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test27584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27584");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        boolean boolean9 = chief2.isVerified();
        chief2.login("hi!", "chief");
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getEmail();
        chief2.logout();
        java.lang.String str17 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test27585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27585");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        boolean boolean8 = chief2.isVerified();
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        chief2.login("hi!", "");
        chief2.viewProfile();
        chief2.viewProfile();
        double double17 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test27586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27586");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        double double13 = chief2.getHourlyRate();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getAccountType();
        boolean boolean16 = chief2.isVerified();
        java.lang.String str17 = chief2.getID();
        java.lang.String str18 = chief2.getEmail();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test27587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27587");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        double double10 = chief2.getHourlyRate();
        chief2.setVerified(false);
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test27588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27588");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        java.lang.String str8 = chief2.getAccountType();
        double double9 = chief2.getHourlyRate();
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getEmail();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test27589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27589");
        model.Chief chief2 = new model.Chief("", "hi!");
        double double3 = chief2.getHourlyRate();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        chief2.setVerified(true);
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getID();
        chief2.login("", "hi!");
        chief2.login("chief", "hi!");
        chief2.setVerified(true);
        java.lang.String str19 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test27590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27590");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        java.lang.String str8 = chief2.getID();
        chief2.logout();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test27591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27591");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getEmail();
        boolean boolean11 = chief2.isVerified();
        chief2.setVerified(true);
        chief2.login("", "hi!");
        chief2.viewProfile();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test27592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27592");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        double double3 = chief2.getHourlyRate();
        double double4 = chief2.getHourlyRate();
        double double5 = chief2.getHourlyRate();
        chief2.setVerified(true);
        java.lang.String str8 = chief2.getID();
        chief2.login("", "");
        double double12 = chief2.getHourlyRate();
        double double13 = chief2.getHourlyRate();
        boolean boolean14 = chief2.isVerified();
        chief2.login("hi!", "chief");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test27593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27593");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getEmail();
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test27594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27594");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.viewProfile();
        double double9 = chief2.getHourlyRate();
        chief2.logout();
        chief2.logout();
        java.lang.String str12 = chief2.getAccountType();
        chief2.logout();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test27595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27595");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "");
        boolean boolean10 = chief2.isVerified();
        double double11 = chief2.getHourlyRate();
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getPassword();
        chief2.login("hi!", "hi!");
        java.lang.String str19 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test27596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27596");
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
        java.lang.String str16 = chief2.getPassword();
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test27597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27597");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        java.lang.String str8 = chief2.getID();
        chief2.setVerified(true);
        chief2.setVerified(false);
        chief2.setVerified(false);
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getEmail();
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test27598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27598");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str10 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
    }

    @Test
    public void test27599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27599");
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
        chief2.logout();
        java.lang.String str16 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test27600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27600");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("", "");
        chief2.viewProfile();
        java.lang.String str12 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.setVerified(false);
        chief2.setVerified(true);
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test27601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27601");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getAccountType();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test27602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27602");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getAccountType();
        boolean boolean13 = chief2.isVerified();
        chief2.logout();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test27603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27603");
        model.Chief chief2 = new model.Chief("", "chief");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test27604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27604");
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
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getID();
        java.lang.String str16 = chief2.getEmail();
        java.lang.String str17 = chief2.getID();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test27605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27605");
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
        double double17 = chief2.getHourlyRate();
        chief2.login("", "");
        chief2.login("hi!", "chief");
        java.lang.Class<?> wildcardClass24 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test27606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27606");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        double double5 = chief2.getHourlyRate();
        chief2.logout();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test27607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27607");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getEmail();
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getPassword();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test27608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27608");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str16 = chief2.getPassword();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test27609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27609");
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
        double double16 = chief2.getHourlyRate();
        chief2.logout();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test27610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27610");
        model.Chief chief2 = new model.Chief("chief", "");
        boolean boolean3 = chief2.isVerified();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getAccountType();
        double double6 = chief2.getHourlyRate();
        chief2.login("chief", "chief");
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getAccountType();
        chief2.login("", "chief");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test27611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27611");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        chief2.setVerified(false);
        double double14 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str17 = chief2.getPassword();
        java.lang.String str18 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test27612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27612");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getID();
        chief2.logout();
        boolean boolean10 = chief2.isVerified();
        boolean boolean11 = chief2.isVerified();
        chief2.login("", "hi!");
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test27613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27613");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        chief2.login("hi!", "hi!");
        chief2.viewProfile();
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getAccountType();
        chief2.login("chief", "");
        java.lang.String str18 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test27614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27614");
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
        java.lang.String str16 = chief2.getPassword();
        java.lang.String str17 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test27615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27615");
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
        java.lang.String str20 = chief2.getID();
        java.lang.String str21 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test27616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27616");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        double double9 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test27617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27617");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test27618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27618");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        double double7 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str10 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test27619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27619");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        java.lang.String str3 = chief2.getPassword();
        boolean boolean4 = chief2.isVerified();
        double double5 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test27620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27620");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getAccountType();
        boolean boolean9 = chief2.isVerified();
        chief2.login("chief", "chief");
        java.lang.String str13 = chief2.getID();
        double double14 = chief2.getHourlyRate();
        chief2.login("chief", "chief");
        chief2.logout();
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test27621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27621");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        chief2.login("hi!", "");
        double double12 = chief2.getHourlyRate();
        boolean boolean13 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test27622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27622");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test27623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27623");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getEmail();
        chief2.viewProfile();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getAccountType();
        chief2.viewProfile();
        boolean boolean9 = chief2.isVerified();
        chief2.viewProfile();
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test27624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27624");
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
        java.lang.Class<?> wildcardClass21 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test27625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27625");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getAccountType();
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getAccountType();
        chief2.login("", "hi!");
        java.lang.String str16 = chief2.getAccountType();
        boolean boolean17 = chief2.isVerified();
        boolean boolean18 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test27626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27626");
        model.Chief chief2 = new model.Chief("", "chief");
        double double3 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test27627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27627");
        model.Chief chief2 = new model.Chief("", "hi!");
        java.lang.String str3 = chief2.getID();
        chief2.login("hi!", "chief");
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test27628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27628");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        double double3 = chief2.getHourlyRate();
        boolean boolean4 = chief2.isVerified();
        chief2.setVerified(true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test27629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27629");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        chief2.login("", "");
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.login("chief", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test27630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27630");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        chief2.setVerified(true);
        chief2.logout();
        chief2.viewProfile();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        java.lang.String str14 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test27631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27631");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        chief2.setVerified(true);
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str11 = chief2.getPassword();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test27632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27632");
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
        chief2.login("chief", "hi!");
        chief2.setVerified(true);
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.login("", "chief");
        chief2.logout();
        chief2.login("chief", "hi!");
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test27633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27633");
        model.Chief chief2 = new model.Chief("", "chief");
        double double3 = chief2.getHourlyRate();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
    }

    @Test
    public void test27634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27634");
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
        java.lang.String str19 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test27635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27635");
        model.Chief chief2 = new model.Chief("", "chief");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "hi!");
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getPassword();
        chief2.login("chief", "hi!");
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test27636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27636");
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
        double double20 = chief2.getHourlyRate();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test27637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27637");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        double double7 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test27638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27638");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.setVerified(false);
        chief2.login("chief", "chief");
        boolean boolean16 = chief2.isVerified();
        java.lang.String str17 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str20 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test27639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27639");
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
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test27640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27640");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        chief2.logout();
        chief2.setVerified(false);
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getAccountType();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test27641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27641");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.login("chief", "hi!");
        boolean boolean14 = chief2.isVerified();
        chief2.logout();
        chief2.login("hi!", "");
        chief2.logout();
        java.lang.String str20 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test27642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27642");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("", "");
        boolean boolean10 = chief2.isVerified();
        double double11 = chief2.getHourlyRate();
        chief2.login("hi!", "chief");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test27643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27643");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        chief2.logout();
        chief2.login("", "hi!");
        chief2.viewProfile();
        boolean boolean14 = chief2.isVerified();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test27644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27644");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getEmail();
        chief2.login("", "hi!");
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test27645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27645");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        chief2.login("", "chief");
        chief2.login("", "");
        java.lang.String str13 = chief2.getEmail();
        java.lang.String str14 = chief2.getPassword();
        double double15 = chief2.getHourlyRate();
        chief2.login("chief", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test27646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27646");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getEmail();
        boolean boolean11 = chief2.isVerified();
        chief2.viewProfile();
        chief2.login("hi!", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test27647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27647");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        boolean boolean9 = chief2.isVerified();
        boolean boolean10 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test27648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27648");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        double double12 = chief2.getHourlyRate();
        chief2.setVerified(true);
        java.lang.String str15 = chief2.getID();
        java.lang.String str16 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test27649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27649");
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
        java.lang.String str15 = chief2.getAccountType();
        double double16 = chief2.getHourlyRate();
        double double17 = chief2.getHourlyRate();
        java.lang.String str18 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test27650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27650");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        chief2.logout();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        chief2.viewProfile();
        chief2.setVerified(true);
        double double13 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str17 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test27651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27651");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        chief2.viewProfile();
        double double8 = chief2.getHourlyRate();
        chief2.login("chief", "hi!");
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getAccountType();
        chief2.setVerified(false);
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str18 = chief2.getAccountType();
        java.lang.String str19 = chief2.getEmail();
        java.lang.String str20 = chief2.getPassword();
        java.lang.String str21 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass22 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test27652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27652");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getPassword();
        chief2.setVerified(false);
        double double11 = chief2.getHourlyRate();
        chief2.login("chief", "");
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getID();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test27653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27653");
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
        chief2.login("", "chief");
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getAccountType();
        java.lang.String str18 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test27654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27654");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        chief2.login("hi!", "hi!");
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getEmail();
        chief2.login("hi!", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test27655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27655");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getAccountType();
        boolean boolean12 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test27656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27656");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getEmail();
        chief2.login("", "hi!");
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getAccountType();
        chief2.logout();
        boolean boolean12 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test27657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27657");
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
        java.lang.String str16 = chief2.getID();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test27658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27658");
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
        java.lang.String str25 = chief2.getID();
        java.lang.String str26 = chief2.getAccountType();
        java.lang.String str27 = chief2.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "chief" + "'", str25, "chief");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "chief" + "'", str26, "chief");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "chief" + "'", str27, "chief");
    }

    @Test
    public void test27659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27659");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("", "");
        chief2.logout();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getID();
        chief2.setVerified(true);
        chief2.viewProfile();
        boolean boolean15 = chief2.isVerified();
        java.lang.Class<?> wildcardClass16 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test27660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27660");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getAccountType();
        java.lang.String str13 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str16 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test27661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27661");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        chief2.login("hi!", "");
        java.lang.String str12 = chief2.getEmail();
        chief2.viewProfile();
        chief2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test27662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27662");
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
        chief2.logout();
        double double16 = chief2.getHourlyRate();
        java.lang.String str17 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test27663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27663");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(false);
        boolean boolean9 = chief2.isVerified();
        boolean boolean10 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test27664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27664");
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
        java.lang.String str16 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        java.lang.String str20 = chief2.getAccountType();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test27665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27665");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        double double12 = chief2.getHourlyRate();
        boolean boolean13 = chief2.isVerified();
        boolean boolean14 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str17 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test27666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27666");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getEmail();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test27667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27667");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getAccountType();
        boolean boolean11 = chief2.isVerified();
        chief2.logout();
        java.lang.String str13 = chief2.getEmail();
        double double14 = chief2.getHourlyRate();
        chief2.logout();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test27668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27668");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getID();
        chief2.viewProfile();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str12 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test27669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27669");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getID();
        chief2.logout();
        java.lang.String str11 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test27670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27670");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getID();
        double double9 = chief2.getHourlyRate();
        chief2.login("chief", "");
        java.lang.String str13 = chief2.getEmail();
        double double14 = chief2.getHourlyRate();
        boolean boolean15 = chief2.isVerified();
        double double16 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test27671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27671");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        chief2.setVerified(true);
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getAccountType();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getID();
        java.lang.String str16 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test27672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27672");
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
        java.lang.String str14 = chief2.getAccountType();
        chief2.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test27673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27673");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getEmail();
        chief2.logout();
        chief2.login("", "hi!");
        chief2.logout();
        boolean boolean13 = chief2.isVerified();
        chief2.viewProfile();
        chief2.login("hi!", "");
        chief2.login("chief", "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test27674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27674");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        chief2.logout();
        chief2.logout();
        java.lang.String str11 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test27675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27675");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        chief2.logout();
        boolean boolean7 = chief2.isVerified();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.login("", "chief");
        boolean boolean13 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test27676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27676");
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
        java.lang.String str17 = chief2.getAccountType();
        double double18 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test27677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27677");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getAccountType();
        chief2.login("hi!", "chief");
        chief2.viewProfile();
        java.lang.String str13 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test27678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27678");
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
        chief2.viewProfile();
        chief2.login("chief", "");
        boolean boolean19 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test27679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27679");
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
        double double14 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str16 = chief2.getEmail();
        boolean boolean17 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test27680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27680");
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
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test27681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27681");
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
        double double18 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test27682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27682");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getID();
        boolean boolean14 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test27683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27683");
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
        double double18 = chief2.getHourlyRate();
        java.lang.String str19 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test27684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27684");
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
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getPassword();
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test27685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27685");
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
        chief2.viewProfile();
        chief2.login("chief", "");
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test27686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27686");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        java.lang.String str8 = chief2.getAccountType();
        double double9 = chief2.getHourlyRate();
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getPassword();
        chief2.login("", "");
        chief2.login("chief", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test27687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27687");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(true);
        double double9 = chief2.getHourlyRate();
        chief2.setVerified(false);
        boolean boolean12 = chief2.isVerified();
        double double13 = chief2.getHourlyRate();
        double double14 = chief2.getHourlyRate();
        chief2.viewProfile();
        boolean boolean16 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test27688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27688");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        double double8 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str10 = chief2.getID();
        double double11 = chief2.getHourlyRate();
        double double12 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test27689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27689");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getID();
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.logout();
        chief2.login("chief", "chief");
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test27690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27690");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getEmail();
        chief2.login("", "hi!");
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test27691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27691");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getAccountType();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        double double18 = chief2.getHourlyRate();
        chief2.login("chief", "hi!");
        boolean boolean22 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test27692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27692");
        model.Chief chief2 = new model.Chief("", "chief");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
    }

    @Test
    public void test27693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27693");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getID();
        double double12 = chief2.getHourlyRate();
        chief2.logout();
        chief2.viewProfile();
        chief2.logout();
        boolean boolean16 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test27694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27694");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getID();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test27695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27695");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.logout();
        chief2.login("", "");
        chief2.login("chief", "chief");
        chief2.logout();
        chief2.logout();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test27696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27696");
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
        double double14 = chief2.getHourlyRate();
        chief2.logout();
        chief2.setVerified(false);
        boolean boolean18 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test27697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27697");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        java.lang.String str8 = chief2.getPassword();
        chief2.login("chief", "chief");
        chief2.login("chief", "");
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getEmail();
        chief2.viewProfile();
        double double18 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test27698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27698");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getAccountType();
        java.lang.String str7 = chief2.getAccountType();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getPassword();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test27699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27699");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        chief2.setVerified(false);
        boolean boolean10 = chief2.isVerified();
        java.lang.String str11 = chief2.getPassword();
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test27700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27700");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.viewProfile();
        java.lang.String str5 = chief2.getEmail();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass8 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test27701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27701");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        boolean boolean8 = chief2.isVerified();
        chief2.login("", "hi!");
        java.lang.String str12 = chief2.getAccountType();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test27702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27702");
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
        chief2.login("chief", "hi!");
        java.lang.String str19 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str21 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
    }

    @Test
    public void test27703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27703");
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
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test27704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27704");
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
        double double15 = chief2.getHourlyRate();
        java.lang.String str16 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test27705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27705");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        chief2.login("", "hi!");
        double double12 = chief2.getHourlyRate();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test27706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27706");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        boolean boolean5 = chief2.isVerified();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.login("chief", "chief");
        chief2.logout();
        boolean boolean13 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test27707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27707");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test27708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27708");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        chief2.logout();
        chief2.login("", "hi!");
        chief2.viewProfile();
        chief2.login("", "");
        chief2.logout();
        java.lang.String str17 = chief2.getID();
        java.lang.String str18 = chief2.getAccountType();
        double double19 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test27709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27709");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getAccountType();
        chief2.login("", "hi!");
        boolean boolean14 = chief2.isVerified();
        chief2.viewProfile();
        double double16 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test27710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27710");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
    }

    @Test
    public void test27711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27711");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.login("hi!", "hi!");
        chief2.setVerified(false);
        boolean boolean10 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str13 = chief2.getPassword();
        chief2.logout();
        java.lang.String str15 = chief2.getAccountType();
        java.lang.String str16 = chief2.getEmail();
        boolean boolean17 = chief2.isVerified();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test27712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27712");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        chief2.login("hi!", "");
        chief2.viewProfile();
        boolean boolean11 = chief2.isVerified();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test27713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27713");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        double double10 = chief2.getHourlyRate();
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getID();
        chief2.login("", "chief");
        java.lang.String str16 = chief2.getEmail();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test27714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27714");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(false);
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        chief2.viewProfile();
        java.lang.String str12 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
    }

    @Test
    public void test27715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27715");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        chief2.logout();
        chief2.login("", "hi!");
        chief2.viewProfile();
        chief2.login("", "");
        java.lang.String str16 = chief2.getPassword();
        java.lang.Class<?> wildcardClass17 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test27716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27716");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        boolean boolean6 = chief2.isVerified();
        chief2.login("", "hi!");
        chief2.login("", "hi!");
        chief2.logout();
        double double14 = chief2.getHourlyRate();
        chief2.setVerified(false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test27717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27717");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getEmail();
        chief2.viewProfile();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getID();
        boolean boolean13 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test27718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27718");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getEmail();
        chief2.logout();
        java.lang.String str13 = chief2.getEmail();
        double double14 = chief2.getHourlyRate();
        double double15 = chief2.getHourlyRate();
        double double16 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test27719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27719");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getPassword();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getAccountType();
        double double12 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test27720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27720");
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
        chief2.setVerified(true);
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test27721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27721");
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
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test27722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27722");
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
        java.lang.String str12 = chief2.getAccountType();
        chief2.viewProfile();
        double double14 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str16 = chief2.getPassword();
        chief2.login("", "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test27723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27723");
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
        chief2.logout();
        boolean boolean15 = chief2.isVerified();
        java.lang.String str16 = chief2.getAccountType();
        java.lang.String str17 = chief2.getPassword();
        java.lang.String str18 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
    }

    @Test
    public void test27724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27724");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getID();
        chief2.setVerified(true);
        chief2.logout();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        chief2.setVerified(true);
        double double15 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test27725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27725");
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
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test27726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27726");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getAccountType();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getPassword();
        double double14 = chief2.getHourlyRate();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test27727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27727");
        model.Chief chief2 = new model.Chief("", "chief");
        double double3 = chief2.getHourlyRate();
        chief2.viewProfile();
        boolean boolean5 = chief2.isVerified();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        double double8 = chief2.getHourlyRate();
        chief2.setVerified(false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test27728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27728");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str6 = chief2.getEmail();
        chief2.setVerified(true);
        java.lang.String str9 = chief2.getPassword();
        chief2.setVerified(false);
        boolean boolean12 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getEmail();
        double double15 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test27729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27729");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getEmail();
        boolean boolean11 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str13 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str16 = chief2.getPassword();
        chief2.setVerified(false);
        java.lang.String str19 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test27730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27730");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        chief2.login("", "");
        chief2.logout();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getAccountType();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test27731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27731");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "chief");
        chief2.logout();
        chief2.setVerified(true);
        double double13 = chief2.getHourlyRate();
        chief2.logout();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test27732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27732");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        chief2.login("hi!", "hi!");
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str12 = chief2.getEmail();
        chief2.setVerified(true);
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str17 = chief2.getPassword();
        java.lang.String str18 = chief2.getID();
        chief2.viewProfile();
        java.lang.Class<?> wildcardClass20 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test27733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27733");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getPassword();
        chief2.logout();
        java.lang.String str7 = chief2.getID();
        chief2.viewProfile();
        chief2.logout();
        boolean boolean10 = chief2.isVerified();
        chief2.setVerified(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test27734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27734");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        chief2.setVerified(false);
        chief2.logout();
        boolean boolean12 = chief2.isVerified();
        chief2.login("", "");
        java.lang.String str16 = chief2.getID();
        java.lang.String str17 = chief2.getEmail();
        java.lang.String str18 = chief2.getEmail();
        java.lang.String str19 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str21 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test27735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27735");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.login("hi!", "hi!");
        chief2.setVerified(false);
        boolean boolean10 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str13 = chief2.getAccountType();
        boolean boolean14 = chief2.isVerified();
        java.lang.String str15 = chief2.getAccountType();
        chief2.setVerified(false);
        chief2.logout();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test27736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27736");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.logout();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getAccountType();
        double double7 = chief2.getHourlyRate();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test27737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27737");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        chief2.viewProfile();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.login("hi!", "chief");
        chief2.setVerified(true);
        chief2.viewProfile();
        java.lang.String str16 = chief2.getID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
    }

    @Test
    public void test27738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27738");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getID();
        chief2.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
    }

    @Test
    public void test27739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27739");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getPassword();
        chief2.logout();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test27740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27740");
        model.Chief chief2 = new model.Chief("", "hi!");
        double double3 = chief2.getHourlyRate();
        java.lang.String str4 = chief2.getPassword();
        chief2.viewProfile();
        chief2.logout();
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        double double9 = chief2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test27741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27741");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getID();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getID();
        boolean boolean14 = chief2.isVerified();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test27742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27742");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        chief2.setVerified(true);
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getPassword();
        boolean boolean11 = chief2.isVerified();
        chief2.login("chief", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test27743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27743");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getAccountType();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getID();
        chief2.login("", "");
        boolean boolean11 = chief2.isVerified();
        java.lang.String str12 = chief2.getAccountType();
        boolean boolean13 = chief2.isVerified();
        chief2.login("chief", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test27744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27744");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        chief2.logout();
        java.lang.String str6 = chief2.getID();
        double double7 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.setVerified(true);
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test27745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27745");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        double double5 = chief2.getHourlyRate();
        java.lang.String str6 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.setVerified(true);
        chief2.logout();
        chief2.setVerified(false);
        chief2.login("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        chief2.viewProfile();
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
    }

    @Test
    public void test27746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27746");
        model.Chief chief2 = new model.Chief("", "chief");
        java.lang.String str3 = chief2.getPassword();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getID();
        java.lang.String str9 = chief2.getID();
        chief2.setVerified(false);
        double double12 = chief2.getHourlyRate();
        boolean boolean13 = chief2.isVerified();
        chief2.setVerified(true);
        chief2.login("chief", "");
        java.lang.Class<?> wildcardClass19 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test27747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27747");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str12 = chief2.getID();
        double double13 = chief2.getHourlyRate();
        boolean boolean14 = chief2.isVerified();
        java.lang.String str15 = chief2.getID();
        java.lang.String str16 = chief2.getPassword();
        java.lang.String str17 = chief2.getPassword();
        chief2.login("", "chief");
        boolean boolean21 = chief2.isVerified();
        boolean boolean22 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test27748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27748");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test27749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27749");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
    }

    @Test
    public void test27750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27750");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        boolean boolean5 = chief2.isVerified();
        java.lang.String str6 = chief2.getPassword();
        chief2.setVerified(true);
        double double9 = chief2.getHourlyRate();
        chief2.setVerified(false);
        boolean boolean12 = chief2.isVerified();
        chief2.logout();
        java.lang.String str14 = chief2.getEmail();
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test27751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27751");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getEmail();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test27752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27752");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        double double8 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str10 = chief2.getPassword();
        chief2.login("chief", "chief");
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test27753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27753");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getEmail();
        double double11 = chief2.getHourlyRate();
        double double12 = chief2.getHourlyRate();
        java.lang.String str13 = chief2.getAccountType();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test27754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27754");
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
        java.lang.String str21 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
    }

    @Test
    public void test27755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27755");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        double double4 = chief2.getHourlyRate();
        chief2.viewProfile();
        boolean boolean6 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str8 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test27756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27756");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test27757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27757");
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
        chief2.logout();
        java.lang.String str21 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass22 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test27758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27758");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "");
        java.lang.String str10 = chief2.getEmail();
        chief2.viewProfile();
        chief2.logout();
        double double13 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test27759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27759");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        double double4 = chief2.getHourlyRate();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        boolean boolean7 = chief2.isVerified();
        java.lang.String str8 = chief2.getPassword();
        chief2.login("hi!", "");
        chief2.setVerified(true);
        java.lang.String str14 = chief2.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test27760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27760");
        model.Chief chief2 = new model.Chief("hi!", "hi!");
        chief2.setVerified(true);
        double double5 = chief2.getHourlyRate();
        chief2.login("", "chief");
        double double9 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str13 = chief2.getEmail();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test27761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27761");
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
        chief2.logout();
        chief2.setVerified(true);
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test27762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27762");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        double double4 = chief2.getHourlyRate();
        chief2.login("hi!", "");
        java.lang.String str8 = chief2.getEmail();
        java.lang.String str9 = chief2.getPassword();
        chief2.login("", "chief");
        boolean boolean13 = chief2.isVerified();
        boolean boolean14 = chief2.isVerified();
        java.lang.Class<?> wildcardClass15 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test27763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27763");
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
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test27764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27764");
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
        boolean boolean13 = chief2.isVerified();
        chief2.login("", "chief");
        chief2.login("hi!", "");
        java.lang.String str20 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chief" + "'", str20, "chief");
    }

    @Test
    public void test27765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27765");
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
        chief2.viewProfile();
        chief2.login("chief", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test27766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27766");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str6 = chief2.getEmail();
        chief2.viewProfile();
        boolean boolean8 = chief2.isVerified();
        java.lang.String str9 = chief2.getEmail();
        java.lang.String str10 = chief2.getPassword();
        boolean boolean11 = chief2.isVerified();
        boolean boolean12 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test27767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27767");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        chief2.setVerified(false);
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str13 = chief2.getEmail();
        double double14 = chief2.getHourlyRate();
        boolean boolean15 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test27768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27768");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        double double10 = chief2.getHourlyRate();
        chief2.logout();
        chief2.viewProfile();
        boolean boolean13 = chief2.isVerified();
        double double14 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test27769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27769");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getAccountType();
        boolean boolean7 = chief2.isVerified();
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getEmail();
        double double10 = chief2.getHourlyRate();
        java.lang.String str11 = chief2.getAccountType();
        chief2.logout();
        double double13 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test27770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27770");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        double double12 = chief2.getHourlyRate();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getID();
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test27771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27771");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getPassword();
        chief2.logout();
        double double8 = chief2.getHourlyRate();
        boolean boolean9 = chief2.isVerified();
        chief2.viewProfile();
        chief2.viewProfile();
        double double12 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test27772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27772");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getAccountType();
        chief2.logout();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getAccountType();
        java.lang.String str11 = chief2.getAccountType();
        boolean boolean12 = chief2.isVerified();
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getID();
        double double15 = chief2.getHourlyRate();
        boolean boolean16 = chief2.isVerified();
        java.lang.String str17 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test27773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27773");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getAccountType();
        boolean boolean12 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.setVerified(true);
        java.lang.String str17 = chief2.getID();
        java.lang.String str18 = chief2.getID();
        java.lang.String str19 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test27774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27774");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.viewProfile();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getPassword();
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test27775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27775");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str15 = chief2.getEmail();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test27776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27776");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getID();
        java.lang.String str8 = chief2.getEmail();
        boolean boolean9 = chief2.isVerified();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test27777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27777");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        boolean boolean6 = chief2.isVerified();
        java.lang.String str7 = chief2.getID();
        boolean boolean8 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str10 = chief2.getAccountType();
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test27778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27778");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getID();
        chief2.logout();
        chief2.logout();
        java.lang.String str9 = chief2.getEmail();
        chief2.viewProfile();
        chief2.viewProfile();
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test27779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27779");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        chief2.logout();
        java.lang.String str12 = chief2.getID();
        java.lang.String str13 = chief2.getEmail();
        chief2.login("hi!", "hi!");
        java.lang.String str17 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
    }

    @Test
    public void test27780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27780");
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
        double double18 = chief2.getHourlyRate();
        chief2.logout();
        java.lang.String str20 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test27781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27781");
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
        java.lang.String str21 = chief2.getPassword();
        double double22 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test27782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27782");
        model.Chief chief2 = new model.Chief("chief", "");
        double double3 = chief2.getHourlyRate();
        chief2.logout();
        chief2.login("chief", "chief");
        double double8 = chief2.getHourlyRate();
        java.lang.String str9 = chief2.getAccountType();
        chief2.setVerified(true);
        java.lang.String str12 = chief2.getAccountType();
        boolean boolean13 = chief2.isVerified();
        chief2.viewProfile();
        java.lang.String str15 = chief2.getAccountType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test27783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27783");
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
        chief2.logout();
        chief2.viewProfile();
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
    public void test27784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27784");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.viewProfile();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test27785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27785");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        boolean boolean5 = chief2.isVerified();
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str9 = chief2.getPassword();
        chief2.logout();
        java.lang.String str11 = chief2.getPassword();
        chief2.login("chief", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test27786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27786");
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
        boolean boolean13 = chief2.isVerified();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
    }

    @Test
    public void test27787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27787");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        java.lang.String str4 = chief2.getPassword();
        double double5 = chief2.getHourlyRate();
        double double6 = chief2.getHourlyRate();
        chief2.setVerified(false);
        boolean boolean9 = chief2.isVerified();
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test27788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27788");
        model.Chief chief2 = new model.Chief("", "chief");
        chief2.setVerified(false);
        chief2.logout();
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str9 = chief2.getID();
        java.lang.String str10 = chief2.getPassword();
        boolean boolean11 = chief2.isVerified();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test27789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27789");
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
        chief2.logout();
        java.lang.String str15 = chief2.getEmail();
        java.lang.String str16 = chief2.getID();
        chief2.setVerified(true);
        java.lang.String str19 = chief2.getAccountType();
        java.lang.String str20 = chief2.getPassword();
        java.lang.String str21 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chief" + "'", str21, "chief");
    }

    @Test
    public void test27790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27790");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getAccountType();
        java.lang.String str4 = chief2.getID();
        chief2.setVerified(true);
        chief2.logout();
        chief2.setVerified(false);
        chief2.viewProfile();
        java.lang.String str11 = chief2.getAccountType();
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
    }

    @Test
    public void test27791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27791");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        chief2.login("hi!", "");
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.Class<?> wildcardClass12 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test27792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27792");
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
        java.lang.String str15 = chief2.getEmail();
        chief2.viewProfile();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test27793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27793");
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
        chief2.viewProfile();
        boolean boolean13 = chief2.isVerified();
        chief2.viewProfile();
        chief2.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test27794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27794");
        model.Chief chief2 = new model.Chief("", "chief");
        double double3 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.setVerified(false);
        chief2.setVerified(true);
        chief2.setVerified(true);
        chief2.setVerified(false);
        chief2.logout();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test27795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27795");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.viewProfile();
        java.lang.String str9 = chief2.getAccountType();
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test27796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27796");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        double double7 = chief2.getHourlyRate();
        chief2.setVerified(true);
        chief2.login("", "hi!");
        java.lang.String str13 = chief2.getPassword();
        java.lang.String str14 = chief2.getEmail();
        chief2.viewProfile();
        java.lang.String str16 = chief2.getID();
        double double17 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chief" + "'", str16, "chief");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test27797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27797");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getID();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        chief2.viewProfile();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test27798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27798");
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
        java.lang.String str13 = chief2.getPassword();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test27799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27799");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getPassword();
        java.lang.String str9 = chief2.getAccountType();
        chief2.login("hi!", "hi!");
        java.lang.String str13 = chief2.getID();
        java.lang.String str14 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
    }

    @Test
    public void test27800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27800");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getPassword();
        chief2.viewProfile();
        chief2.setVerified(true);
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getID();
        boolean boolean9 = chief2.isVerified();
        chief2.setVerified(false);
        chief2.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test27801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27801");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.login("", "");
        double double8 = chief2.getHourlyRate();
        double double9 = chief2.getHourlyRate();
        java.lang.String str10 = chief2.getEmail();
        java.lang.String str11 = chief2.getEmail();
        chief2.login("chief", "");
        chief2.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test27802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27802");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        double double6 = chief2.getHourlyRate();
        java.lang.String str7 = chief2.getEmail();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getPassword();
        java.lang.String str10 = chief2.getAccountType();
        chief2.viewProfile();
        chief2.logout();
        java.lang.String str13 = chief2.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test27803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27803");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getPassword();
        java.lang.String str6 = chief2.getEmail();
        boolean boolean7 = chief2.isVerified();
        chief2.setVerified(true);
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getAccountType();
        java.lang.String str12 = chief2.getAccountType();
        double double13 = chief2.getHourlyRate();
        java.lang.String str14 = chief2.getAccountType();
        java.lang.String str15 = chief2.getPassword();
        chief2.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chief" + "'", str14, "chief");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test27804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27804");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        java.lang.String str7 = chief2.getPassword();
        boolean boolean8 = chief2.isVerified();
        boolean boolean9 = chief2.isVerified();
        chief2.login("hi!", "hi!");
        chief2.setVerified(false);
        chief2.logout();
        boolean boolean16 = chief2.isVerified();
        chief2.logout();
        java.lang.String str18 = chief2.getAccountType();
        java.lang.String str19 = chief2.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chief" + "'", str18, "chief");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "chief" + "'", str19, "chief");
    }

    @Test
    public void test27805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27805");
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
        chief2.login("", "");
        java.lang.String str17 = chief2.getPassword();
        java.lang.Class<?> wildcardClass18 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "chief" + "'", str17, "chief");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test27806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27806");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        java.lang.String str4 = chief2.getPassword();
        chief2.logout();
        chief2.login("chief", "chief");
        java.lang.String str9 = chief2.getAccountType();
        boolean boolean10 = chief2.isVerified();
        chief2.setVerified(false);
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test27807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27807");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getAccountType();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getAccountType();
        java.lang.String str8 = chief2.getID();
        chief2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chief" + "'", str7, "chief");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
    }

    @Test
    public void test27808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27808");
        model.Chief chief2 = new model.Chief("hi!", "");
        java.lang.String str3 = chief2.getID();
        chief2.logout();
        java.lang.String str5 = chief2.getEmail();
        java.lang.String str6 = chief2.getPassword();
        java.lang.String str7 = chief2.getPassword();
        chief2.setVerified(true);
        chief2.setVerified(false);
        chief2.setVerified(true);
        chief2.logout();
        java.lang.String str15 = chief2.getID();
        boolean boolean16 = chief2.isVerified();
        java.lang.String str17 = chief2.getEmail();
        double double18 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chief" + "'", str3, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test27809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27809");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        java.lang.String str6 = chief2.getEmail();
        java.lang.String str7 = chief2.getPassword();
        java.lang.String str8 = chief2.getAccountType();
        java.lang.String str9 = chief2.getAccountType();
        chief2.logout();
        double double11 = chief2.getHourlyRate();
        java.lang.String str12 = chief2.getAccountType();
        chief2.viewProfile();
        java.lang.String str14 = chief2.getEmail();
        boolean boolean15 = chief2.isVerified();
        double double16 = chief2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chief" + "'", str9, "chief");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test27810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27810");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getID();
        double double5 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str8 = chief2.getAccountType();
        chief2.setVerified(false);
        java.lang.String str11 = chief2.getID();
        chief2.logout();
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getPassword();
        chief2.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chief" + "'", str8, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test27811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27811");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.setVerified(false);
        chief2.logout();
        double double6 = chief2.getHourlyRate();
        chief2.login("chief", "");
        chief2.login("", "");
        java.lang.String str13 = chief2.getAccountType();
        java.lang.String str14 = chief2.getPassword();
        java.lang.String str15 = chief2.getID();
        boolean boolean16 = chief2.isVerified();
        boolean boolean17 = chief2.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chief" + "'", str13, "chief");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chief" + "'", str15, "chief");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test27812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27812");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.logout();
        java.lang.String str4 = chief2.getAccountType();
        java.lang.String str5 = chief2.getID();
        chief2.viewProfile();
        double double7 = chief2.getHourlyRate();
        chief2.setVerified(false);
        java.lang.String str10 = chief2.getID();
        java.lang.String str11 = chief2.getID();
        java.lang.String str12 = chief2.getID();
        boolean boolean13 = chief2.isVerified();
        boolean boolean14 = chief2.isVerified();
        chief2.login("hi!", "chief");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chief" + "'", str4, "chief");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chief" + "'", str5, "chief");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chief" + "'", str10, "chief");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chief" + "'", str11, "chief");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chief" + "'", str12, "chief");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test27813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27813");
        model.Chief chief2 = new model.Chief("hi!", "");
        chief2.viewProfile();
        chief2.setVerified(false);
        java.lang.String str6 = chief2.getID();
        chief2.login("hi!", "");
        java.lang.String str10 = chief2.getPassword();
        java.lang.String str11 = chief2.getPassword();
        java.lang.String str12 = chief2.getPassword();
        java.lang.Class<?> wildcardClass13 = chief2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chief" + "'", str6, "chief");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

