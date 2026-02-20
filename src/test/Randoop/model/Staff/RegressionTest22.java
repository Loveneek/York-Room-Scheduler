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
        staff3.logout();
        java.lang.String str16 = staff3.getPassword();
        staff3.setVerified(false);
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.viewProfile();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getID();
        boolean boolean14 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
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
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.login("hi!", "");
        java.lang.String str12 = staff3.getPassword();
        staff3.login("hi!", "");
        boolean boolean16 = staff3.isVerified();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
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
        boolean boolean14 = staff3.isVerified();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getID();
        staff3.logout();
        java.lang.String str18 = staff3.getEmail();
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.logout();
        boolean boolean11 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getPassword();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getEmail();
        staff3.logout();
        staff3.logout();
        staff3.login("hi!", "");
        staff3.logout();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
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
        staff3.login("staff", "");
        java.lang.String str18 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str20 = staff3.getEmail();
        boolean boolean21 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
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
        java.lang.String str23 = staff3.getPassword();
        boolean boolean24 = staff3.isVerified();
        staff3.login("staff", "");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        double double7 = staff3.getHourlyRate();
        staff3.logout();
        boolean boolean9 = staff3.isVerified();
        staff3.login("hi!", "hi!");
        java.lang.String str13 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.setVerified(true);
        java.lang.String str18 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        model.Staff staff3 = new model.Staff("", "staff", "");
        java.lang.String str4 = staff3.getPassword();
        java.lang.String str5 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        staff3.logout();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getPassword();
        boolean boolean13 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.login("staff", "hi!");
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getID();
        boolean boolean12 = staff3.isVerified();
        staff3.login("", "staff");
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("hi!", "hi!");
        staff3.logout();
        staff3.logout();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        boolean boolean8 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
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
        staff3.login("", "");
        boolean boolean19 = staff3.isVerified();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("", "staff");
        java.lang.String str11 = staff3.getPassword();
        staff3.logout();
        double double13 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
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
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
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
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.login("", "");
        staff3.viewProfile();
        java.lang.String str15 = staff3.getEmail();
        staff3.login("", "hi!");
        double double19 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
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
        staff3.setVerified(true);
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
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        java.lang.String str10 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        staff3.logout();
        boolean boolean9 = staff3.isVerified();
        boolean boolean10 = staff3.isVerified();
        java.lang.Class<?> wildcardClass11 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
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
        staff3.logout();
        java.lang.String str19 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str22 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        staff3.viewProfile();
        boolean boolean9 = staff3.isVerified();
        double double10 = staff3.getHourlyRate();
        staff3.viewProfile();
        boolean boolean12 = staff3.isVerified();
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.setVerified(true);
        boolean boolean17 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str21 = staff3.getAccountType();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
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
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str26 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        java.lang.String str11 = staff3.getPassword();
        staff3.logout();
        boolean boolean13 = staff3.isVerified();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getPassword();
        staff3.setVerified(false);
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        staff3.logout();
        staff3.login("staff", "hi!");
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
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
        staff3.login("staff", "");
        java.lang.String str22 = staff3.getID();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str8 = staff3.getID();
        boolean boolean9 = staff3.isVerified();
        boolean boolean10 = staff3.isVerified();
        staff3.logout();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getEmail();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getEmail();
        boolean boolean12 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        boolean boolean13 = staff3.isVerified();
        staff3.logout();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.setVerified(true);
        staff3.logout();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("hi!", "hi!");
        boolean boolean11 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getEmail();
        double double10 = staff3.getHourlyRate();
        staff3.setVerified(true);
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str8 = staff3.getID();
        boolean boolean9 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str12 = staff3.getPassword();
        boolean boolean13 = staff3.isVerified();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        model.Staff staff3 = new model.Staff("", "hi!", "");
        staff3.login("hi!", "hi!");
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("hi!", "staff");
        boolean boolean12 = staff3.isVerified();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        model.Staff staff3 = new model.Staff("", "staff", "");
        java.lang.String str4 = staff3.getPassword();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("", "hi!");
        java.lang.String str10 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        staff3.viewProfile();
        staff3.viewProfile();
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getAccountType();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getPassword();
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
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
        double double15 = staff3.getHourlyRate();
        staff3.setVerified(true);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.viewProfile();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("", "hi!");
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getPassword();
        java.lang.Class<?> wildcardClass11 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
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
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
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
        double double20 = staff3.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.login("hi!", "staff");
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        double double7 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str9 = staff3.getPassword();
        staff3.logout();
        staff3.login("staff", "");
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        model.Staff staff3 = new model.Staff("", "", "staff");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getPassword();
        staff3.login("", "");
        staff3.login("hi!", "hi!");
        java.lang.String str12 = staff3.getID();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.login("", "staff");
        double double9 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        java.lang.String str13 = staff3.getPassword();
        staff3.logout();
        java.lang.String str15 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.String str18 = staff3.getEmail();
        java.lang.String str19 = staff3.getPassword();
        java.lang.String str20 = staff3.getPassword();
        java.lang.String str21 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
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
        staff3.login("hi!", "");
        java.lang.String str18 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
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
        java.lang.String str22 = staff3.getID();
        boolean boolean23 = staff3.isVerified();
        boolean boolean24 = staff3.isVerified();
        java.lang.String str25 = staff3.getID();
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
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.login("staff", "hi!");
        staff3.logout();
        java.lang.String str13 = staff3.getEmail();
        staff3.setVerified(false);
        double double16 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        double double20 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        staff3.logout();
        staff3.login("staff", "hi!");
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getEmail();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
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
        java.lang.String str24 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getAccountType();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getID();
        java.lang.Class<?> wildcardClass9 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.viewProfile();
        staff3.setVerified(true);
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getEmail();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "hi!");
        staff3.login("staff", "hi!");
        staff3.login("staff", "");
        staff3.viewProfile();
        java.lang.String str17 = staff3.getAccountType();
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
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
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
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
        staff3.logout();
        java.lang.String str24 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        staff3.login("hi!", "staff");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str17 = staff3.getEmail();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
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
        boolean boolean19 = staff3.isVerified();
        java.lang.String str20 = staff3.getPassword();
        java.lang.String str21 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
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
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("", "staff");
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
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
        java.lang.String str18 = staff3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        staff3.login("staff", "");
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        boolean boolean8 = staff3.isVerified();
        staff3.login("hi!", "staff");
        staff3.logout();
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        boolean boolean6 = staff3.isVerified();
        staff3.login("staff", "");
        java.lang.String str10 = staff3.getEmail();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
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
        double double17 = staff3.getHourlyRate();
        java.lang.String str18 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        staff3.logout();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getID();
        staff3.setVerified(true);
        staff3.logout();
        double double17 = staff3.getHourlyRate();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
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
        staff3.viewProfile();
        double double17 = staff3.getHourlyRate();
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getEmail();
        java.lang.String str20 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        staff3.setVerified(false);
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getEmail();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
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
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str20 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
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
        java.lang.String str17 = staff3.getEmail();
        staff3.login("staff", "hi!");
        staff3.setVerified(true);
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.viewProfile();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        model.Staff staff3 = new model.Staff("", "", "");
        staff3.viewProfile();
        double double5 = staff3.getHourlyRate();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getAccountType();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
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
        staff3.setVerified(false);
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
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getPassword();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str10 = staff3.getAccountType();
        double double11 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        model.Staff staff3 = new model.Staff("hi!", "", "staff");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str7 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
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
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getAccountType();
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getEmail();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
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
        java.lang.String str15 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
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
        double double15 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
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
        staff3.logout();
        staff3.logout();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
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
        boolean boolean19 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
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
        staff3.logout();
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
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
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        staff3.viewProfile();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        double double8 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        staff3.logout();
        staff3.login("hi!", "staff");
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.login("hi!", "");
        staff3.logout();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("", "hi!");
        staff3.login("", "staff");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        double double9 = staff3.getHourlyRate();
        double double10 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.login("staff", "");
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.login("", "staff");
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
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
        java.lang.String str15 = staff3.getPassword();
        double double16 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
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
        java.lang.String str15 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
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
        java.lang.String str17 = staff3.getEmail();
        staff3.viewProfile();
        staff3.login("hi!", "");
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        staff3.login("", "staff");
        staff3.login("", "");
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        java.lang.String str23 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getID();
        boolean boolean12 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str16 = staff3.getPassword();
        boolean boolean17 = staff3.isVerified();
        boolean boolean18 = staff3.isVerified();
        staff3.viewProfile();
        staff3.setVerified(true);
        boolean boolean22 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        model.Staff staff3 = new model.Staff("", "", "staff");
        java.lang.String str4 = staff3.getID();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getID();
        java.lang.Class<?> wildcardClass8 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
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
        staff3.login("", "staff");
        boolean boolean22 = staff3.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(true);
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getEmail();
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        double double11 = staff3.getHourlyRate();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
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
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.setVerified(false);
        boolean boolean10 = staff3.isVerified();
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        staff3.login("", "hi!");
        staff3.viewProfile();
        java.lang.String str15 = staff3.getPassword();
        staff3.logout();
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getEmail();
        java.lang.String str19 = staff3.getID();
        java.lang.String str20 = staff3.getID();
        java.lang.String str21 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getPassword();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getAccountType();
        boolean boolean13 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
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
        java.lang.String str16 = staff3.getEmail();
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "");
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getEmail();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
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
        staff3.login("", "staff");
        double double23 = staff3.getHourlyRate();
        java.lang.String str24 = staff3.getAccountType();
        java.lang.String str25 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "staff" + "'", str24, "staff");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
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
        staff3.setVerified(false);
        staff3.login("hi!", "");
        double double26 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 40.0d + "'", double26 == 40.0d);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        model.Staff staff3 = new model.Staff("", "", "staff");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getPassword();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        double double13 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str15 = staff3.getAccountType();
        staff3.logout();
        staff3.setVerified(true);
        staff3.login("staff", "");
        java.lang.String str22 = staff3.getEmail();
        boolean boolean23 = staff3.isVerified();
        java.lang.String str24 = staff3.getID();
        boolean boolean25 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        staff3.logout();
        staff3.logout();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
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
        staff3.setVerified(false);
        java.lang.String str18 = staff3.getPassword();
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
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
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
        java.lang.Class<?> wildcardClass22 = staff3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        model.Staff staff3 = new model.Staff("staff", "hi!", "hi!");
        staff3.logout();
        staff3.logout();
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
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
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        model.Staff staff3 = new model.Staff("", "staff", "");
        java.lang.String str4 = staff3.getPassword();
        java.lang.String str5 = staff3.getEmail();
        staff3.logout();
        staff3.login("staff", "");
        java.lang.String str10 = staff3.getEmail();
        staff3.viewProfile();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getPassword();
        staff3.login("hi!", "staff");
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        staff3.logout();
        double double9 = staff3.getHourlyRate();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getEmail();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getID();
        boolean boolean12 = staff3.isVerified();
        boolean boolean13 = staff3.isVerified();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        staff3.login("", "hi!");
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        staff3.login("hi!", "hi!");
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getEmail();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        staff3.setVerified(false);
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getPassword();
        double double15 = staff3.getHourlyRate();
        staff3.logout();
        staff3.login("staff", "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        java.lang.String str5 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        model.Staff staff3 = new model.Staff("", "hi!", "staff");
        boolean boolean4 = staff3.isVerified();
        boolean boolean5 = staff3.isVerified();
        java.lang.Class<?> wildcardClass6 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("", "");
        boolean boolean12 = staff3.isVerified();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.logout();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
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
        java.lang.String str18 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
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
        double double20 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        staff3.setVerified(true);
        staff3.viewProfile();
        boolean boolean13 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str8 = staff3.getID();
        boolean boolean9 = staff3.isVerified();
        boolean boolean10 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
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
        staff3.logout();
        boolean boolean16 = staff3.isVerified();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
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
        staff3.logout();
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
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
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
        double double17 = staff3.getHourlyRate();
        java.lang.String str18 = staff3.getEmail();
        java.lang.String str19 = staff3.getID();
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
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
        boolean boolean16 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str19 = staff3.getPassword();
        java.lang.String str20 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
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
        java.lang.String str30 = staff3.getID();
        java.lang.String str31 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 40.0d + "'", double26 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
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
        staff3.login("hi!", "");
        java.lang.String str20 = staff3.getPassword();
        staff3.login("", "");
        staff3.setVerified(false);
        java.lang.String str26 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("", "staff");
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        double double13 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getEmail();
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getID();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        model.Staff staff3 = new model.Staff("", "", "staff");
        staff3.login("staff", "");
        boolean boolean7 = staff3.isVerified();
        boolean boolean8 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
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
        staff3.viewProfile();
        java.lang.String str22 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
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
        staff3.login("", "");
        staff3.logout();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        staff3.login("", "staff");
        staff3.login("", "");
        staff3.login("hi!", "staff");
        boolean boolean22 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.logout();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str14 = staff3.getPassword();
        staff3.viewProfile();
        staff3.login("hi!", "");
        java.lang.String str19 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
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
        staff3.logout();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
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
        java.lang.String str24 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean27 = staff3.isVerified();
        java.lang.String str28 = staff3.getEmail();
        java.lang.String str29 = staff3.getEmail();
        java.lang.String str30 = staff3.getPassword();
        java.lang.String str31 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
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
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
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
        double double15 = staff3.getHourlyRate();
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
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
        java.lang.String str16 = staff3.getAccountType();
        staff3.setVerified(false);
        double double19 = staff3.getHourlyRate();
        java.lang.String str20 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        double double12 = staff3.getHourlyRate();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
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
        java.lang.String str19 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str22 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
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
        java.lang.String str14 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        staff3.setVerified(false);
        java.lang.String str20 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
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
        staff3.logout();
        staff3.login("hi!", "");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        model.Staff staff3 = new model.Staff("staff", "", "staff");
        staff3.setVerified(true);
        staff3.logout();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        boolean boolean11 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
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
        boolean boolean20 = staff3.isVerified();
        staff3.viewProfile();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getPassword();
        java.lang.Class<?> wildcardClass11 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
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
        double double17 = staff3.getHourlyRate();
        boolean boolean18 = staff3.isVerified();
        boolean boolean19 = staff3.isVerified();
        java.lang.String str20 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getEmail();
        staff3.login("", "staff");
        staff3.login("hi!", "staff");
        java.lang.String str22 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.setVerified(false);
        boolean boolean10 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        java.lang.String str13 = staff3.getPassword();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        double double8 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        staff3.logout();
        java.lang.String str13 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        staff3.setVerified(true);
        staff3.setVerified(true);
        java.lang.String str12 = staff3.getPassword();
        staff3.login("hi!", "staff");
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str13 = staff3.getPassword();
        staff3.setVerified(true);
        double double16 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
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
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean11 = staff3.isVerified();
        staff3.login("hi!", "staff");
        double double15 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str17 = staff3.getAccountType();
        staff3.login("staff", "");
        staff3.setVerified(false);
        staff3.login("hi!", "");
        java.lang.String str26 = staff3.getID();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
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
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        model.Staff staff3 = new model.Staff("", "", "staff");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getPassword();
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getEmail();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("staff", "hi!");
        staff3.logout();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str16 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        java.lang.Class<?> wildcardClass10 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
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
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getEmail();
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getPassword();
        staff3.viewProfile();
        staff3.login("staff", "staff");
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        staff3.login("", "");
        boolean boolean15 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.logout();
        staff3.setVerified(false);
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.logout();
        staff3.logout();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getEmail();
        staff3.login("", "hi!");
        java.lang.String str13 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getAccountType();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        double double9 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
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
        staff3.viewProfile();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass9 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getID();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
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
        boolean boolean14 = staff3.isVerified();
        double double15 = staff3.getHourlyRate();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(true);
        staff3.login("hi!", "staff");
        java.lang.String str11 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
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
        staff3.logout();
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getEmail();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.logout();
        staff3.logout();
        java.lang.String str13 = staff3.getPassword();
        staff3.setVerified(true);
        java.lang.String str16 = staff3.getPassword();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
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
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
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
        boolean boolean15 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.setVerified(true);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
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
        java.lang.String str16 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
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
        java.lang.String str18 = staff3.getAccountType();
        staff3.setVerified(true);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "hi!");
        staff3.login("hi!", "staff");
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getEmail();
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getID();
        staff3.logout();
        java.lang.String str9 = staff3.getAccountType();
        boolean boolean10 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getEmail();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        java.lang.String str10 = staff3.getPassword();
        staff3.logout();
        staff3.login("staff", "hi!");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
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
        double double14 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
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
        staff3.login("hi!", "staff");
        staff3.setVerified(true);
        java.lang.String str21 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
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
        java.lang.String str21 = staff3.getID();
        staff3.login("", "staff");
        boolean boolean25 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        staff3.login("staff", "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
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
        staff3.setVerified(true);
        java.lang.String str19 = staff3.getPassword();
        java.lang.String str20 = staff3.getPassword();
        java.lang.String str21 = staff3.getEmail();
        boolean boolean22 = staff3.isVerified();
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
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
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
        java.lang.String str16 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str18 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str11 = staff3.getAccountType();
        double double12 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        double double7 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("", "");
        double double13 = staff3.getHourlyRate();
        java.lang.String str14 = staff3.getAccountType();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
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
        boolean boolean15 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getID();
        staff3.login("", "staff");
        staff3.logout();
        staff3.viewProfile();
        staff3.login("staff", "staff");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        model.Staff staff3 = new model.Staff("", "", "staff");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        double double6 = staff3.getHourlyRate();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getEmail();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        double double9 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str13 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        staff3.login("hi!", "hi!");
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getID();
        staff3.logout();
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "hi!");
        staff3.login("staff", "hi!");
        staff3.login("staff", "");
        java.lang.String str16 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
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
        java.lang.String str24 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean27 = staff3.isVerified();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
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
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
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
        staff3.login("", "");
        double double21 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
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
        staff3.login("staff", "");
        staff3.logout();
        java.lang.String str23 = staff3.getEmail();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getPassword();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        boolean boolean9 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getID();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        staff3.login("", "hi!");
        staff3.setVerified(true);
        double double18 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getID();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getAccountType();
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str17 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str19 = staff3.getEmail();
        java.lang.String str20 = staff3.getID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        double double9 = staff3.getHourlyRate();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getAccountType();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getPassword();
        boolean boolean14 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str17 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
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
        staff3.setVerified(false);
        staff3.login("hi!", "staff");
        double double20 = staff3.getHourlyRate();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        boolean boolean8 = staff3.isVerified();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getID();
        double double14 = staff3.getHourlyRate();
        java.lang.String str15 = staff3.getPassword();
        staff3.setVerified(false);
        double double18 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("", "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.logout();
        staff3.logout();
        staff3.login("hi!", "");
        staff3.login("hi!", "staff");
        java.lang.String str18 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
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
        java.lang.String str20 = staff3.getEmail();
        double double21 = staff3.getHourlyRate();
        java.lang.String str22 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        staff3.logout();
        staff3.login("", "");
        staff3.logout();
        staff3.logout();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
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
        staff3.setVerified(false);
        java.lang.String str21 = staff3.getEmail();
        staff3.logout();
        java.lang.String str23 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        model.Staff staff3 = new model.Staff("staff", "hi!", "staff");
        boolean boolean4 = staff3.isVerified();
        staff3.logout();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass7 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getID();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str13 = staff3.getPassword();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
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
        staff3.setVerified(true);
        staff3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        boolean boolean10 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getPassword();
        staff3.setVerified(true);
        double double16 = staff3.getHourlyRate();
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
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
        staff3.login("staff", "");
        staff3.viewProfile();
        staff3.logout();
        double double21 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str23 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "staff" + "'", str23, "staff");
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
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
        staff3.login("staff", "");
        staff3.login("staff", "hi!");
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getEmail();
        staff3.login("staff", "staff");
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
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
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getID();
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
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
        java.lang.String str17 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str20 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
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
        staff3.login("", "staff");
        double double23 = staff3.getHourlyRate();
        double double24 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 40.0d + "'", double24 == 40.0d);
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(true);
        double double11 = staff3.getHourlyRate();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getEmail();
        java.lang.String str14 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        boolean boolean9 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getPassword();
        double double14 = staff3.getHourlyRate();
        boolean boolean15 = staff3.isVerified();
        staff3.setVerified(false);
        boolean boolean18 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
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
        boolean boolean13 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
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
        java.lang.String str15 = staff3.getID();
        boolean boolean16 = staff3.isVerified();
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
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
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str16 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.login("", "hi!");
        staff3.logout();
        java.lang.String str11 = staff3.getEmail();
        staff3.setVerified(true);
        java.lang.String str14 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.login("", "hi!");
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
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
        java.lang.String str19 = staff3.getEmail();
        java.lang.String str20 = staff3.getPassword();
        double double21 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        staff3.logout();
        boolean boolean11 = staff3.isVerified();
        staff3.login("hi!", "hi!");
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "hi!");
        staff3.login("hi!", "staff");
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.logout();
        staff3.login("staff", "staff");
        staff3.viewProfile();
        staff3.logout();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getPassword();
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        double double5 = staff3.getHourlyRate();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getEmail();
        staff3.logout();
        java.lang.String str9 = staff3.getPassword();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("", "");
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        java.lang.String str11 = staff3.getID();
        staff3.logout();
        boolean boolean13 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        double double5 = staff3.getHourlyRate();
        staff3.setVerified(true);
        java.lang.Class<?> wildcardClass8 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
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
        java.lang.String str20 = staff3.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        staff3.login("hi!", "hi!");
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getID();
        staff3.logout();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean12 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.setVerified(false);
        staff3.setVerified(true);
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        double double7 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        boolean boolean12 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        double double5 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 40.0d + "'", double5 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        boolean boolean8 = staff3.isVerified();
        java.lang.String str9 = staff3.getEmail();
        staff3.setVerified(true);
        double double12 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getEmail();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getID();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
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
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.setVerified(false);
        java.lang.String str11 = staff3.getAccountType();
        staff3.logout();
        staff3.login("", "hi!");
        staff3.setVerified(true);
        double double18 = staff3.getHourlyRate();
        java.lang.String str19 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
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
        staff3.login("", "");
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
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
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
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
        staff3.login("hi!", "hi!");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        staff3.logout();
        boolean boolean12 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getEmail();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
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
        staff3.setVerified(true);
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
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
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getPassword();
        boolean boolean10 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.logout();
        staff3.setVerified(true);
        double double9 = staff3.getHourlyRate();
        staff3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        boolean boolean11 = staff3.isVerified();
        boolean boolean12 = staff3.isVerified();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getAccountType();
        staff3.login("hi!", "");
        staff3.logout();
        java.lang.String str19 = staff3.getEmail();
        staff3.login("", "");
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        java.lang.String str11 = staff3.getPassword();
        staff3.login("", "hi!");
        java.lang.String str15 = staff3.getID();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
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
        staff3.viewProfile();
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
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
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getPassword();
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getID();
        java.lang.String str9 = staff3.getEmail();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
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
        java.lang.String str17 = staff3.getEmail();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "staff");
        staff3.login("hi!", "staff");
        staff3.login("", "staff");
        java.lang.String str10 = staff3.getPassword();
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
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
        java.lang.String str19 = staff3.getID();
        staff3.login("hi!", "");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
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
        staff3.logout();
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.login("hi!", "");
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getID();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
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
        double double17 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        java.lang.String str21 = staff3.getPassword();
        double double22 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.login("staff", "hi!");
        java.lang.String str12 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getPassword();
        java.lang.String str17 = staff3.getEmail();
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getAccountType();
        boolean boolean10 = staff3.isVerified();
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        java.lang.String str13 = staff3.getID();
        staff3.login("hi!", "staff");
        staff3.logout();
        staff3.login("", "hi!");
        java.lang.String str21 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
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
        java.lang.String str17 = staff3.getAccountType();
        staff3.logout();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
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
        boolean boolean17 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str20 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.login("staff", "");
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getAccountType();
        staff3.logout();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
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
        java.lang.String str15 = staff3.getID();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        model.Staff staff3 = new model.Staff("", "staff", "");
        java.lang.String str4 = staff3.getPassword();
        java.lang.String str5 = staff3.getEmail();
        staff3.logout();
        staff3.login("staff", "");
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getPassword();
        java.lang.Class<?> wildcardClass13 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
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
        staff3.logout();
        staff3.logout();
        double double20 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getEmail();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getAccountType();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getAccountType();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getID();
        staff3.login("hi!", "staff");
        java.lang.String str16 = staff3.getPassword();
        staff3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.logout();
        staff3.setVerified(true);
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        staff3.login("staff", "");
        staff3.login("staff", "staff");
        java.lang.String str18 = staff3.getID();
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.setVerified(true);
        java.lang.String str6 = staff3.getPassword();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("", "staff");
        boolean boolean12 = staff3.isVerified();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
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
        java.lang.String str16 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
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
        java.lang.String str16 = staff3.getPassword();
        java.lang.String str17 = staff3.getID();
        staff3.setVerified(true);
        double double20 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
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
        staff3.logout();
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
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        staff3.logout();
        double double9 = staff3.getHourlyRate();
        staff3.setVerified(false);
        boolean boolean12 = staff3.isVerified();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.login("hi!", "staff");
        java.lang.String str12 = staff3.getID();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getPassword();
        double double17 = staff3.getHourlyRate();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str9 = staff3.getEmail();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
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
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str20 = staff3.getID();
        staff3.login("", "");
        java.lang.String str24 = staff3.getID();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
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
        staff3.login("hi!", "staff");
        boolean boolean27 = staff3.isVerified();
        boolean boolean28 = staff3.isVerified();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str11 = staff3.getEmail();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        model.Staff staff3 = new model.Staff("", "staff", "");
        boolean boolean4 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
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
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.String str19 = staff3.getAccountType();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getAccountType();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getPassword();
        staff3.viewProfile();
        staff3.login("", "");
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getID();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
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
        java.lang.String str20 = staff3.getEmail();
        double double21 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.login("", "");
        staff3.login("hi!", "");
        java.lang.String str15 = staff3.getID();
        staff3.logout();
        java.lang.String str17 = staff3.getID();
        double double18 = staff3.getHourlyRate();
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
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
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getPassword();
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getID();
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.login("hi!", "");
        boolean boolean13 = staff3.isVerified();
        double double14 = staff3.getHourlyRate();
        staff3.viewProfile();
        double double16 = staff3.getHourlyRate();
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
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
        boolean boolean16 = staff3.isVerified();
        staff3.logout();
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
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
        java.lang.String str22 = staff3.getID();
        java.lang.String str23 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("", "staff");
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
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
        staff3.login("", "");
        java.lang.String str22 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
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
        staff3.setVerified(true);
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.setVerified(true);
        staff3.logout();
        staff3.logout();
        java.lang.String str8 = staff3.getID();
        staff3.logout();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getPassword();
        java.lang.String str6 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
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
        java.lang.String str15 = staff3.getID();
        staff3.viewProfile();
        staff3.login("hi!", "");
        staff3.logout();
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
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.logout();
        staff3.logout();
        boolean boolean11 = staff3.isVerified();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getID();
        java.lang.String str15 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str8 = staff3.getID();
        boolean boolean9 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str12 = staff3.getPassword();
        boolean boolean13 = staff3.isVerified();
        boolean boolean14 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
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
        java.lang.String str17 = staff3.getPassword();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.logout();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
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
        staff3.viewProfile();
        double double17 = staff3.getHourlyRate();
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getEmail();
        java.lang.String str20 = staff3.getAccountType();
        boolean boolean21 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
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
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getEmail();
        boolean boolean12 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getEmail();
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
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getEmail();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getID();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getID();
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
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean9 = staff3.isVerified();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getID();
        boolean boolean13 = staff3.isVerified();
        staff3.logout();
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        staff3.login("", "hi!");
        java.lang.String str22 = staff3.getPassword();
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.logout();
        java.lang.String str26 = staff3.getPassword();
        java.lang.Class<?> wildcardClass27 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
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
        staff3.logout();
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
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
        java.lang.String str17 = staff3.getAccountType();
        boolean boolean18 = staff3.isVerified();
        boolean boolean19 = staff3.isVerified();
        java.lang.String str20 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
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
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getEmail();
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(true);
        staff3.login("hi!", "hi!");
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getPassword();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        model.Staff staff3 = new model.Staff("", "", "staff");
        staff3.login("staff", "");
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getEmail();
        staff3.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("hi!", "hi!");
        staff3.login("", "staff");
        boolean boolean13 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getID();
        staff3.viewProfile();
        staff3.setVerified(true);
        double double16 = staff3.getHourlyRate();
        staff3.setVerified(false);
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        staff3.logout();
        staff3.login("staff", "hi!");
        java.lang.String str16 = staff3.getAccountType();
        java.lang.String str17 = staff3.getPassword();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
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
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str7 = staff3.getAccountType();
        staff3.login("staff", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        boolean boolean14 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
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
        java.lang.String str21 = staff3.getEmail();
        java.lang.String str22 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
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
        staff3.setVerified(true);
        staff3.setVerified(false);
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
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
        staff3.logout();
        java.lang.String str18 = staff3.getAccountType();
        double double19 = staff3.getHourlyRate();
        java.lang.String str20 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.setVerified(false);
        staff3.logout();
        boolean boolean11 = staff3.isVerified();
        staff3.login("", "staff");
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getID();
        staff3.viewProfile();
        staff3.viewProfile();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.login("staff", "hi!");
        java.lang.String str12 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getPassword();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.setVerified(true);
        boolean boolean11 = staff3.isVerified();
        staff3.login("hi!", "staff");
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.viewProfile();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
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
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
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
        double double22 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
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
        staff3.viewProfile();
        java.lang.String str17 = staff3.getID();
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str12 = staff3.getID();
        staff3.login("", "hi!");
        boolean boolean16 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.String str22 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str8 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str12 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getID();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        java.lang.String str9 = staff3.getID();
        staff3.login("hi!", "");
        staff3.logout();
        staff3.logout();
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
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
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getPassword();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        java.lang.String str8 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str12 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getID();
        staff3.logout();
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
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
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        java.lang.String str4 = staff3.getEmail();
        staff3.logout();
        java.lang.String str6 = staff3.getID();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getAccountType();
        staff3.login("hi!", "");
        staff3.viewProfile();
        staff3.logout();
        staff3.setVerified(true);
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getAccountType();
        java.lang.String str13 = staff3.getAccountType();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getPassword();
        staff3.setVerified(false);
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getPassword();
        staff3.setVerified(true);
        boolean boolean14 = staff3.isVerified();
        boolean boolean15 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        java.lang.String str8 = staff3.getID();
        boolean boolean9 = staff3.isVerified();
        boolean boolean10 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str14 = staff3.getEmail();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getID();
        java.lang.Class<?> wildcardClass17 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getPassword();
        staff3.viewProfile();
        staff3.login("staff", "staff");
        java.lang.String str10 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        model.Staff staff3 = new model.Staff("", "hi!", "hi!");
        staff3.login("staff", "staff");
        staff3.login("staff", "hi!");
        staff3.login("staff", "hi!");
        java.lang.String str13 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        boolean boolean8 = staff3.isVerified();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getAccountType();
        staff3.viewProfile();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getAccountType();
        staff3.login("hi!", "");
        double double20 = staff3.getHourlyRate();
        java.lang.String str21 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
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
        java.lang.String str21 = staff3.getPassword();
        java.lang.String str22 = staff3.getID();
        double double23 = staff3.getHourlyRate();
        java.lang.String str24 = staff3.getID();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.logout();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
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
        staff3.login("staff", "hi!");
        java.lang.String str18 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean9 = staff3.isVerified();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getPassword();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
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
        boolean boolean16 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
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
        staff3.login("", "staff");
        staff3.setVerified(false);
        staff3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        staff3.setVerified(false);
        boolean boolean14 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
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
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
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
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getEmail();
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        boolean boolean11 = staff3.isVerified();
        staff3.setVerified(false);
        java.lang.String str14 = staff3.getAccountType();
        java.lang.String str15 = staff3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str12 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
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
        java.lang.Class<?> wildcardClass15 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
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
        staff3.login("", "staff");
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getID();
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
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getAccountType();
        staff3.login("staff", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        java.lang.String str12 = staff3.getEmail();
        staff3.setVerified(false);
        java.lang.String str15 = staff3.getEmail();
        staff3.login("", "staff");
        java.lang.String str19 = staff3.getEmail();
        java.lang.String str20 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass21 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "staff" + "'", str20, "staff");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
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
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getID();
        boolean boolean17 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
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
        staff3.viewProfile();
        staff3.viewProfile();
        staff3.login("staff", "");
        double double22 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
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
        staff3.logout();
        staff3.login("staff", "staff");
        boolean boolean19 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
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
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str10 = staff3.getID();
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        boolean boolean13 = staff3.isVerified();
        staff3.setVerified(true);
        java.lang.String str16 = staff3.getID();
        staff3.login("", "hi!");
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getAccountType();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        java.lang.String str4 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str9 = staff3.getEmail();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getPassword();
        java.lang.String str11 = staff3.getPassword();
        java.lang.Class<?> wildcardClass12 = staff3.getClass();
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
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getPassword();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        java.lang.String str9 = staff3.getID();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getPassword();
        java.lang.String str13 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean9 = staff3.isVerified();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getID();
        boolean boolean13 = staff3.isVerified();
        staff3.login("staff", "hi!");
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getAccountType();
        java.lang.String str19 = staff3.getAccountType();
        java.lang.String str20 = staff3.getID();
        java.lang.String str21 = staff3.getEmail();
        staff3.viewProfile();
        java.lang.String str23 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "staff" + "'", str19, "staff");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.viewProfile();
        staff3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        double double9 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
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
        staff3.login("staff", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        staff3.logout();
        staff3.setVerified(true);
        staff3.setVerified(true);
        staff3.logout();
        boolean boolean13 = staff3.isVerified();
        java.lang.Class<?> wildcardClass14 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.setVerified(true);
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getEmail();
        double double13 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str15 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getEmail();
        double double7 = staff3.getHourlyRate();
        java.lang.String str8 = staff3.getPassword();
        staff3.login("hi!", "hi!");
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        double double14 = staff3.getHourlyRate();
        staff3.logout();
        double double16 = staff3.getHourlyRate();
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.logout();
        staff3.viewProfile();
        staff3.login("", "");
        staff3.login("", "hi!");
        double double15 = staff3.getHourlyRate();
        staff3.logout();
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        staff3.login("staff", "");
        boolean boolean11 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str13 = staff3.getID();
        staff3.viewProfile();
        double double15 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
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
        staff3.login("", "staff");
        staff3.viewProfile();
        staff3.viewProfile();
        double double21 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
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
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
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
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str17 = staff3.getAccountType();
        java.lang.String str18 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        boolean boolean11 = staff3.isVerified();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getAccountType();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getEmail();
        staff3.logout();
        java.lang.String str10 = staff3.getEmail();
        java.lang.String str11 = staff3.getEmail();
        boolean boolean12 = staff3.isVerified();
        boolean boolean13 = staff3.isVerified();
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
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
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str26 = staff3.getID();
        staff3.logout();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        boolean boolean7 = staff3.isVerified();
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        boolean boolean8 = staff3.isVerified();
        boolean boolean9 = staff3.isVerified();
        double double10 = staff3.getHourlyRate();
        boolean boolean11 = staff3.isVerified();
        double double12 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "hi!");
        staff3.login("hi!", "staff");
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        staff3.setVerified(false);
        java.lang.String str12 = staff3.getAccountType();
        staff3.logout();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
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
        staff3.logout();
        staff3.setVerified(false);
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.logout();
        java.lang.String str5 = staff3.getEmail();
        boolean boolean6 = staff3.isVerified();
        java.lang.String str7 = staff3.getEmail();
        staff3.login("", "staff");
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getEmail();
        boolean boolean13 = staff3.isVerified();
        staff3.login("", "hi!");
        boolean boolean17 = staff3.isVerified();
        java.lang.String str18 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
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
        double double23 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
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
        staff3.viewProfile();
        java.lang.String str16 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        model.Staff staff3 = new model.Staff("hi!", "staff", "");
        staff3.logout();
        java.lang.String str5 = staff3.getPassword();
        java.lang.String str6 = staff3.getEmail();
        staff3.login("staff", "staff");
        double double10 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        staff3.setVerified(true);
        java.lang.String str6 = staff3.getPassword();
        boolean boolean7 = staff3.isVerified();
        java.lang.String str8 = staff3.getEmail();
        double double9 = staff3.getHourlyRate();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getID();
        java.lang.String str12 = staff3.getID();
        java.lang.String str13 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
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
        java.lang.String str13 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getID();
        boolean boolean17 = staff3.isVerified();
        staff3.logout();
        boolean boolean19 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        model.Staff staff3 = new model.Staff("staff", "hi!", "");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getPassword();
        staff3.viewProfile();
        staff3.login("staff", "staff");
        boolean boolean10 = staff3.isVerified();
        boolean boolean11 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.logout();
        staff3.logout();
        boolean boolean10 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
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
        java.lang.String str17 = staff3.getID();
        java.lang.String str18 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getAccountType();
        staff3.login("staff", "");
        staff3.login("staff", "");
        staff3.logout();
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getPassword();
        java.lang.String str16 = staff3.getID();
        double double17 = staff3.getHourlyRate();
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
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
        java.lang.String str16 = staff3.getPassword();
        double double17 = staff3.getHourlyRate();
        staff3.logout();
        staff3.logout();
        double double20 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
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
        staff3.viewProfile();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        staff3.logout();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        model.Staff staff3 = new model.Staff("hi!", "hi!", "");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getAccountType();
        java.lang.String str8 = staff3.getAccountType();
        staff3.setVerified(true);
        java.lang.Class<?> wildcardClass11 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "hi!");
        double double8 = staff3.getHourlyRate();
        java.lang.String str9 = staff3.getID();
        java.lang.String str10 = staff3.getAccountType();
        staff3.viewProfile();
        java.lang.String str12 = staff3.getID();
        staff3.setVerified(false);
        staff3.setVerified(false);
        boolean boolean17 = staff3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
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
        java.lang.String str16 = staff3.getID();
        java.lang.String str17 = staff3.getAccountType();
        staff3.setVerified(true);
        boolean boolean20 = staff3.isVerified();
        staff3.viewProfile();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "staff" + "'", str14, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
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
        java.lang.String str14 = staff3.getEmail();
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
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
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
        double double13 = staff3.getHourlyRate();
        staff3.logout();
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getPassword();
        staff3.login("staff", "hi!");
        staff3.login("", "staff");
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "staff" + "'", str12, "staff");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
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
        staff3.logout();
        java.lang.String str22 = staff3.getAccountType();
        boolean boolean23 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "staff" + "'", str22, "staff");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        double double6 = staff3.getHourlyRate();
        staff3.logout();
        staff3.viewProfile();
        boolean boolean9 = staff3.isVerified();
        staff3.logout();
        java.lang.String str11 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
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
        java.lang.String str17 = staff3.getEmail();
        boolean boolean18 = staff3.isVerified();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
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
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getID();
        java.lang.String str19 = staff3.getPassword();
        double double20 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getID();
        double double12 = staff3.getHourlyRate();
        double double13 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        model.Staff staff3 = new model.Staff("", "", "staff");
        staff3.login("staff", "");
        boolean boolean7 = staff3.isVerified();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str11 = staff3.getAccountType();
        java.lang.String str12 = staff3.getEmail();
        staff3.setVerified(false);
        staff3.login("staff", "");
        staff3.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "staff" + "'", str11, "staff");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        staff3.login("hi!", "");
        java.lang.String str11 = staff3.getPassword();
        boolean boolean12 = staff3.isVerified();
        staff3.setVerified(true);
        staff3.setVerified(true);
        boolean boolean17 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str21 = staff3.getEmail();
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
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
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
        staff3.viewProfile();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass19 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
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
        java.lang.String str15 = staff3.getAccountType();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
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
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getID();
        double double17 = staff3.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
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
        staff3.setVerified(true);
        boolean boolean19 = staff3.isVerified();
        java.lang.Class<?> wildcardClass20 = staff3.getClass();
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
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.login("hi!", "staff");
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        model.Staff staff3 = new model.Staff("staff", "staff", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(true);
        double double9 = staff3.getHourlyRate();
        staff3.login("staff", "");
        double double13 = staff3.getHourlyRate();
        staff3.setVerified(true);
        staff3.viewProfile();
        java.lang.String str17 = staff3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "staff" + "'", str17, "staff");
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        staff3.viewProfile();
        java.lang.String str10 = staff3.getID();
        staff3.viewProfile();
        double double12 = staff3.getHourlyRate();
        boolean boolean13 = staff3.isVerified();
        boolean boolean14 = staff3.isVerified();
        java.lang.String str15 = staff3.getEmail();
        java.lang.String str16 = staff3.getPassword();
        double double17 = staff3.getHourlyRate();
        java.lang.String str18 = staff3.getAccountType();
        staff3.login("hi!", "staff");
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "staff" + "'", str18, "staff");
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
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
        java.lang.String str18 = staff3.getEmail();
        double double19 = staff3.getHourlyRate();
        double double20 = staff3.getHourlyRate();
        java.lang.String str21 = staff3.getID();
        staff3.logout();
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.login("", "staff");
        double double9 = staff3.getHourlyRate();
        staff3.login("hi!", "");
        staff3.logout();
        staff3.logout();
        java.lang.String str15 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        model.Staff staff3 = new model.Staff("", "hi!", "hi!");
        staff3.login("staff", "staff");
        java.lang.String str7 = staff3.getID();
        java.lang.String str8 = staff3.getEmail();
        staff3.viewProfile();
        staff3.login("staff", "hi!");
        java.lang.String str13 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        staff3.setVerified(false);
        boolean boolean9 = staff3.isVerified();
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getEmail();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        model.Staff staff3 = new model.Staff("staff", "staff", "hi!");
        staff3.setVerified(false);
        java.lang.String str6 = staff3.getID();
        staff3.login("staff", "hi!");
        staff3.login("", "");
        java.lang.String str13 = staff3.getID();
        double double14 = staff3.getHourlyRate();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
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
        staff3.logout();
        java.lang.String str17 = staff3.getEmail();
        java.lang.String str18 = staff3.getPassword();
        java.lang.String str19 = staff3.getID();
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
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.login("", "staff");
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getAccountType();
        staff3.login("staff", "staff");
        java.lang.String str14 = staff3.getEmail();
        java.lang.String str15 = staff3.getEmail();
        java.lang.Class<?> wildcardClass16 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
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
        java.lang.String str16 = staff3.getPassword();
        double double17 = staff3.getHourlyRate();
        double double18 = staff3.getHourlyRate();
        staff3.viewProfile();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getAccountType();
        java.lang.String str10 = staff3.getID();
        java.lang.String str11 = staff3.getEmail();
        staff3.login("staff", "staff");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "staff" + "'", str9, "staff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getPassword();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getEmail();
        double double9 = staff3.getHourlyRate();
        staff3.viewProfile();
        java.lang.Class<?> wildcardClass11 = staff3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        staff3.setVerified(false);
        staff3.logout();
        staff3.viewProfile();
        staff3.logout();
        staff3.logout();
        java.lang.String str15 = staff3.getEmail();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str7 = staff3.getEmail();
        java.lang.String str8 = staff3.getAccountType();
        java.lang.String str9 = staff3.getID();
        double double10 = staff3.getHourlyRate();
        java.lang.String str11 = staff3.getPassword();
        staff3.login("staff", "staff");
        double double15 = staff3.getHourlyRate();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "staff" + "'", str8, "staff");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
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
        staff3.setVerified(true);
        java.lang.String str21 = staff3.getAccountType();
        staff3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "staff" + "'", str13, "staff");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "staff" + "'", str21, "staff");
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.login("", "");
        double double7 = staff3.getHourlyRate();
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getID();
        staff3.logout();
        staff3.logout();
        staff3.viewProfile();
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
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
        double double21 = staff3.getHourlyRate();
        boolean boolean22 = staff3.isVerified();
        java.lang.String str23 = staff3.getPassword();
        staff3.logout();
        staff3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getAccountType();
        java.lang.String str11 = staff3.getEmail();
        boolean boolean12 = staff3.isVerified();
        java.lang.String str13 = staff3.getPassword();
        java.lang.String str14 = staff3.getPassword();
        staff3.viewProfile();
        java.lang.String str16 = staff3.getPassword();
        staff3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getEmail();
        staff3.viewProfile();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getPassword();
        staff3.login("hi!", "");
        staff3.setVerified(true);
        double double15 = staff3.getHourlyRate();
        java.lang.String str16 = staff3.getAccountType();
        staff3.setVerified(true);
        double double19 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.logout();
        double double11 = staff3.getHourlyRate();
        staff3.viewProfile();
        boolean boolean13 = staff3.isVerified();
        staff3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        staff3.setVerified(true);
        java.lang.String str9 = staff3.getID();
        boolean boolean10 = staff3.isVerified();
        staff3.setVerified(false);
        staff3.logout();
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getPassword();
        staff3.logout();
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        java.lang.String str8 = staff3.getPassword();
        staff3.viewProfile();
        double double10 = staff3.getHourlyRate();
        staff3.setVerified(false);
        staff3.logout();
        staff3.setVerified(false);
        java.lang.String str16 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.viewProfile();
        staff3.login("staff", "");
        staff3.login("", "");
        staff3.viewProfile();
        staff3.logout();
        staff3.viewProfile();
        java.lang.String str17 = staff3.getEmail();
        double double18 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
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
        boolean boolean15 = staff3.isVerified();
        java.lang.String str16 = staff3.getAccountType();
        staff3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        staff3.logout();
        java.lang.String str6 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        java.lang.String str8 = staff3.getPassword();
        java.lang.String str9 = staff3.getPassword();
        staff3.setVerified(true);
        java.lang.String str12 = staff3.getEmail();
        java.lang.String str13 = staff3.getPassword();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
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
        java.lang.String str15 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
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
        staff3.login("staff", "hi!");
        java.lang.String str24 = staff3.getPassword();
        double double25 = staff3.getHourlyRate();
        staff3.logout();
        java.lang.String str27 = staff3.getEmail();
        staff3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 40.0d + "'", double25 == 40.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        model.Staff staff3 = new model.Staff("hi!", "", "hi!");
        java.lang.String str4 = staff3.getAccountType();
        java.lang.String str5 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("staff", "staff");
        java.lang.String str11 = staff3.getPassword();
        java.lang.String str12 = staff3.getEmail();
        boolean boolean13 = staff3.isVerified();
        java.lang.String str14 = staff3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "staff" + "'", str4, "staff");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
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
        java.lang.String str23 = staff3.getEmail();
        double double24 = staff3.getHourlyRate();
        boolean boolean25 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 40.0d + "'", double24 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        model.Staff staff3 = new model.Staff("", "", "staff");
        staff3.login("staff", "staff");
        double double7 = staff3.getHourlyRate();
        double double8 = staff3.getHourlyRate();
        staff3.login("staff", "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        model.Staff staff3 = new model.Staff("", "staff", "staff");
        double double4 = staff3.getHourlyRate();
        java.lang.String str5 = staff3.getAccountType();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getAccountType();
        double double8 = staff3.getHourlyRate();
        staff3.login("", "");
        staff3.setVerified(true);
        staff3.logout();
        staff3.logout();
        staff3.logout();
        boolean boolean17 = staff3.isVerified();
        staff3.logout();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 40.0d + "'", double4 == 40.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "staff" + "'", str6, "staff");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "staff" + "'", str7, "staff");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        boolean boolean5 = staff3.isVerified();
        java.lang.String str6 = staff3.getID();
        java.lang.String str7 = staff3.getID();
        double double8 = staff3.getHourlyRate();
        boolean boolean9 = staff3.isVerified();
        staff3.login("", "");
        java.lang.String str13 = staff3.getPassword();
        double double14 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
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
        boolean boolean16 = staff3.isVerified();
        staff3.viewProfile();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        double double6 = staff3.getHourlyRate();
        java.lang.String str7 = staff3.getPassword();
        staff3.login("", "staff");
        staff3.setVerified(false);
        java.lang.String str13 = staff3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 40.0d + "'", double6 == 40.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        model.Staff staff3 = new model.Staff("", "staff", "");
        staff3.setVerified(true);
        staff3.login("", "hi!");
        staff3.setVerified(true);
        staff3.setVerified(false);
        java.lang.String str13 = staff3.getID();
        staff3.setVerified(true);
        staff3.login("hi!", "staff");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        java.lang.String str4 = staff3.getID();
        java.lang.String str5 = staff3.getAccountType();
        boolean boolean6 = staff3.isVerified();
        staff3.logout();
        staff3.setVerified(false);
        staff3.viewProfile();
        java.lang.String str11 = staff3.getEmail();
        staff3.logout();
        staff3.viewProfile();
        boolean boolean14 = staff3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
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
        java.lang.String str14 = staff3.getPassword();
        java.lang.String str15 = staff3.getAccountType();
        java.lang.String str16 = staff3.getAccountType();
        double double17 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "staff" + "'", str15, "staff");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "staff" + "'", str16, "staff");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
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
        staff3.setVerified(false);
        double double20 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
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
        java.lang.String str18 = staff3.getID();
        staff3.login("hi!", "staff");
        java.lang.String str22 = staff3.getEmail();
        double double23 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "staff" + "'", str5, "staff");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "staff" + "'", str10, "staff");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
        model.Staff staff3 = new model.Staff("", "", "hi!");
        staff3.logout();
        java.lang.String str5 = staff3.getID();
        java.lang.String str6 = staff3.getPassword();
        double double7 = staff3.getHourlyRate();
        staff3.setVerified(false);
        java.lang.String str10 = staff3.getID();
        double double11 = staff3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    }
}

