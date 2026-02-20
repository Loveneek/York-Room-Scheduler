import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getID();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        student3.viewProfile();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getID();
        student3.login("", "hi!");
        double double19 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        student3.setVerified(false);
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getID();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        java.lang.String str5 = student3.getAccountType();
        student3.logout();
        java.lang.String str7 = student3.getPassword();
        student3.logout();
        student3.viewProfile();
        student3.logout();
        double double11 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        boolean boolean9 = student3.isVerified();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getAccountType();
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getPassword();
        student3.logout();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str17 = student3.getEmail();
        student3.logout();
        boolean boolean19 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        student3.login("student", "");
        java.lang.String str11 = student3.getAccountType();
        student3.login("hi!", "student");
        java.lang.String str15 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        double double7 = student3.getHourlyRate();
        student3.login("student", "student");
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        student3.login("", "student");
        java.lang.String str16 = student3.getEmail();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.logout();
        java.lang.String str15 = student3.getAccountType();
        student3.login("", "hi!");
        student3.login("hi!", "hi!");
        student3.setVerified(false);
        boolean boolean24 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        java.lang.String str18 = student3.getID();
        java.lang.String str19 = student3.getEmail();
        java.lang.String str20 = student3.getEmail();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str24 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean27 = student3.isVerified();
        java.lang.Class<?> wildcardClass28 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "hi!");
        student3.login("hi!", "");
        student3.login("student", "");
        java.lang.String str18 = student3.getID();
        boolean boolean19 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getPassword();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getPassword();
        double double7 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        double double13 = student3.getHourlyRate();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        student3.login("", "hi!");
        double double15 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(false);
        student3.login("hi!", "student");
        java.lang.String str22 = student3.getAccountType();
        student3.logout();
        java.lang.String str24 = student3.getPassword();
        java.lang.String str25 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        student3.viewProfile();
        student3.login("student", "student");
        java.lang.String str19 = student3.getAccountType();
        student3.logout();
        java.lang.String str21 = student3.getID();
        java.lang.String str22 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.login("", "student");
        double double9 = student3.getHourlyRate();
        student3.login("hi!", "");
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getID();
        student3.setVerified(true);
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getEmail();
        double double10 = student3.getHourlyRate();
        student3.login("hi!", "student");
        java.lang.String str14 = student3.getAccountType();
        student3.login("", "student");
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.viewProfile();
        student3.login("", "");
        student3.viewProfile();
        student3.logout();
        java.lang.String str14 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getID();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.login("", "student");
        student3.login("", "student");
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getPassword();
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getPassword();
        student3.login("hi!", "student");
        boolean boolean15 = student3.isVerified();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        double double12 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(true);
        double double11 = student3.getHourlyRate();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        boolean boolean14 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getID();
        boolean boolean12 = student3.isVerified();
        student3.login("", "");
        student3.login("", "");
        java.lang.String str19 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        student3.setVerified(false);
        boolean boolean13 = student3.isVerified();
        student3.logout();
        boolean boolean15 = student3.isVerified();
        student3.viewProfile();
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
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getAccountType();
        double double7 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str11 = student3.getID();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        student3.login("", "hi!");
        student3.viewProfile();
        double double15 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getID();
        student3.logout();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getID();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "");
        java.lang.String str12 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean14 = student3.isVerified();
        student3.viewProfile();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getAccountType();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
        model.Student student3 = new model.Student("", "hi!", "hi!");
        student3.login("student", "student");
        java.lang.String str7 = student3.getID();
        student3.viewProfile();
        student3.viewProfile();
        boolean boolean10 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getPassword();
        student3.logout();
        student3.viewProfile();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        java.lang.Class<?> wildcardClass9 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getID();
        student3.logout();
        java.lang.String str15 = student3.getAccountType();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getPassword();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.logout();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        student3.logout();
        student3.viewProfile();
        student3.login("", "");
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        boolean boolean11 = student3.isVerified();
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getAccountType();
        student3.login("hi!", "");
        student3.logout();
        java.lang.String str19 = student3.getEmail();
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        student3.viewProfile();
        java.lang.String str11 = student3.getPassword();
        student3.setVerified(false);
        student3.login("student", "");
        java.lang.String str17 = student3.getAccountType();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getEmail();
        boolean boolean14 = student3.isVerified();
        student3.setVerified(true);
        student3.logout();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str15 = student3.getPassword();
        student3.login("hi!", "student");
        java.lang.String str19 = student3.getEmail();
        student3.logout();
        java.lang.String str21 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        student3.viewProfile();
        student3.viewProfile();
        boolean boolean11 = student3.isVerified();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        student3.login("hi!", "student");
        student3.logout();
        java.lang.String str13 = student3.getID();
        student3.viewProfile();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        student3.logout();
        student3.login("hi!", "student");
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        student3.setVerified(false);
        double double13 = student3.getHourlyRate();
        student3.setVerified(true);
        boolean boolean16 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(true);
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getID();
        student3.logout();
        student3.logout();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getEmail();
        student3.setVerified(false);
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
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getEmail();
        student3.login("hi!", "hi!");
        double double17 = student3.getHourlyRate();
        student3.login("student", "hi!");
        java.lang.Class<?> wildcardClass21 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        boolean boolean13 = student3.isVerified();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.login("hi!", "");
        student3.viewProfile();
        boolean boolean14 = student3.isVerified();
        student3.logout();
        student3.logout();
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean12 = student3.isVerified();
        student3.setVerified(false);
        student3.logout();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getAccountType();
        student3.logout();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str8 = student3.getID();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        student3.logout();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getID();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        student3.login("", "");
        double double15 = student3.getHourlyRate();
        boolean boolean16 = student3.isVerified();
        student3.logout();
        boolean boolean18 = student3.isVerified();
        java.lang.String str19 = student3.getID();
        java.lang.String str20 = student3.getEmail();
        java.lang.Class<?> wildcardClass21 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getAccountType();
        student3.login("student", "student");
        double double10 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(true);
        student3.viewProfile();
        student3.logout();
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getPassword();
        student3.setVerified(true);
        java.lang.String str15 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        student3.login("", "hi!");
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getPassword();
        student3.logout();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getEmail();
        double double19 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(true);
        student3.login("hi!", "");
        boolean boolean13 = student3.isVerified();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "");
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        student3.logout();
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean17 = student3.isVerified();
        boolean boolean18 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.setVerified(false);
        boolean boolean10 = student3.isVerified();
        student3.logout();
        student3.logout();
        student3.logout();
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        model.Student student3 = new model.Student("hi!", "", "student");
        student3.setVerified(false);
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getAccountType();
        student3.logout();
        java.lang.Class<?> wildcardClass9 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getID();
        boolean boolean12 = student3.isVerified();
        student3.login("", "");
        java.lang.String str16 = student3.getPassword();
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getPassword();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getEmail();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getPassword();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass10 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.viewProfile();
        student3.login("", "");
        student3.viewProfile();
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        student3.login("hi!", "student");
        java.lang.String str18 = student3.getPassword();
        double double19 = student3.getHourlyRate();
        boolean boolean20 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getAccountType();
        student3.logout();
        java.lang.String str15 = student3.getPassword();
        double double16 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getID();
        student3.login("", "hi!");
        student3.setVerified(false);
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        student3.login("student", "student");
        student3.login("hi!", "");
        java.lang.String str20 = student3.getPassword();
        student3.login("", "");
        student3.setVerified(false);
        boolean boolean26 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "hi!");
        double double12 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        model.Student student3 = new model.Student("student", "hi!", "student");
        java.lang.String str4 = student3.getID();
        student3.login("", "");
        java.lang.String str8 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getPassword();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getID();
        student3.login("hi!", "hi!");
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getEmail();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getPassword();
        boolean boolean8 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getPassword();
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        student3.setVerified(true);
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "hi!");
        student3.login("hi!", "");
        student3.login("hi!", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str23 = student3.getAccountType();
        double double24 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "student" + "'", str23, "student");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getEmail();
        boolean boolean7 = student3.isVerified();
        double double8 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.logout();
        java.lang.String str10 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getPassword();
        boolean boolean16 = student3.isVerified();
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getPassword();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        java.lang.String str18 = student3.getID();
        student3.setVerified(true);
        double double21 = student3.getHourlyRate();
        java.lang.String str22 = student3.getAccountType();
        student3.setVerified(true);
        java.lang.String str25 = student3.getAccountType();
        boolean boolean26 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "student" + "'", str25, "student");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getAccountType();
        double double7 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        java.lang.String str17 = student3.getID();
        student3.viewProfile();
        student3.logout();
        double double20 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
        model.Student student3 = new model.Student("", "hi!", "");
        student3.viewProfile();
        boolean boolean5 = student3.isVerified();
        student3.logout();
        java.lang.String str7 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        java.lang.String str13 = student3.getID();
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.login("", "student");
        student3.login("", "student");
        java.lang.String str15 = student3.getEmail();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getPassword();
        student3.logout();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getPassword();
        student3.logout();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str13 = student3.getID();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        model.Student student3 = new model.Student("", "student", "");
        student3.setVerified(true);
        student3.viewProfile();
        double double7 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        boolean boolean11 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str13 = student3.getPassword();
        student3.login("", "");
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        model.Student student3 = new model.Student("hi!", "hi!", "hi!");
        student3.login("hi!", "student");
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "");
        java.lang.String str12 = student3.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getID();
        student3.login("", "");
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(true);
        double double11 = student3.getHourlyRate();
        student3.login("hi!", "student");
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getID();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        model.Student student3 = new model.Student("hi!", "", "student");
        java.lang.String str4 = student3.getPassword();
        student3.logout();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(false);
        student3.login("", "hi!");
        double double16 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str16 = student3.getEmail();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "");
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        java.lang.String str14 = student3.getAccountType();
        double double15 = student3.getHourlyRate();
        double double16 = student3.getHourlyRate();
        double double17 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getID();
        boolean boolean12 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getID();
        student3.setVerified(true);
        java.lang.String str11 = student3.getEmail();
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        java.lang.String str10 = student3.getPassword();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str14 = student3.getAccountType();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        student3.login("student", "hi!");
        java.lang.String str15 = student3.getPassword();
        student3.login("student", "");
        student3.login("", "hi!");
        java.lang.String str22 = student3.getEmail();
        student3.login("student", "student");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        boolean boolean14 = student3.isVerified();
        student3.logout();
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getID();
        student3.logout();
        java.lang.String str20 = student3.getPassword();
        java.lang.String str21 = student3.getID();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.logout();
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str14 = student3.getEmail();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str12 = student3.getEmail();
        student3.logout();
        java.lang.String str14 = student3.getAccountType();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getPassword();
        boolean boolean16 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        double double7 = student3.getHourlyRate();
        student3.login("student", "student");
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        student3.setVerified(false);
        boolean boolean16 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        model.Student student3 = new model.Student("hi!", "student", "student");
        student3.setVerified(true);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        boolean boolean10 = student3.isVerified();
        boolean boolean11 = student3.isVerified();
        boolean boolean12 = student3.isVerified();
        student3.logout();
        student3.logout();
        java.lang.String str15 = student3.getEmail();
        student3.logout();
        student3.login("", "");
        student3.viewProfile();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        student3.logout();
        student3.login("student", "student");
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getAccountType();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getAccountType();
        student3.login("student", "student");
        double double10 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getEmail();
        student3.viewProfile();
        student3.login("hi!", "");
        java.lang.String str20 = student3.getEmail();
        student3.login("", "hi!");
        boolean boolean24 = student3.isVerified();
        double double25 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 20.0d + "'", double25 == 20.0d);
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        model.Student student3 = new model.Student("", "", "student");
        student3.login("student", "");
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        student3.login("hi!", "student");
        java.lang.String str13 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        student3.setVerified(false);
        boolean boolean13 = student3.isVerified();
        student3.logout();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getID();
        student3.logout();
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        student3.login("student", "");
        java.lang.String str14 = student3.getAccountType();
        boolean boolean15 = student3.isVerified();
        student3.viewProfile();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        double double9 = student3.getHourlyRate();
        double double10 = student3.getHourlyRate();
        student3.login("hi!", "hi!");
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        double double13 = student3.getHourlyRate();
        student3.login("hi!", "student");
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getEmail();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        student3.login("", "");
        java.lang.String str15 = student3.getPassword();
        student3.login("student", "hi!");
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.login("hi!", "");
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        double double7 = student3.getHourlyRate();
        student3.login("student", "student");
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getAccountType();
        boolean boolean14 = student3.isVerified();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getPassword();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        double double10 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getPassword();
        student3.setVerified(true);
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        boolean boolean14 = student3.isVerified();
        student3.logout();
        java.lang.String str16 = student3.getID();
        student3.viewProfile();
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        double double4 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "");
        boolean boolean12 = student3.isVerified();
        student3.viewProfile();
        student3.login("", "hi!");
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        java.lang.String str12 = student3.getID();
        student3.login("", "hi!");
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str14 = student3.getAccountType();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        model.Student student3 = new model.Student("hi!", "student", "student");
        java.lang.String str4 = student3.getID();
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str9 = student3.getID();
        student3.logout();
        student3.logout();
        student3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(false);
        student3.logout();
        boolean boolean14 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        student3.login("student", "student");
        boolean boolean16 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str12 = student3.getAccountType();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.logout();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        student3.logout();
        double double12 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(false);
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        java.lang.String str18 = student3.getID();
        java.lang.String str19 = student3.getEmail();
        java.lang.String str20 = student3.getAccountType();
        java.lang.String str21 = student3.getAccountType();
        java.lang.String str22 = student3.getID();
        student3.login("hi!", "hi!");
        student3.logout();
        java.lang.String str27 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.viewProfile();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.logout();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        student3.login("student", "student");
        boolean boolean17 = student3.isVerified();
        student3.setVerified(false);
        student3.logout();
        boolean boolean21 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "hi!");
        student3.login("student", "hi!");
        student3.login("student", "");
        student3.viewProfile();
        java.lang.String str17 = student3.getAccountType();
        java.lang.String str18 = student3.getEmail();
        boolean boolean19 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        model.Student student3 = new model.Student("hi!", "hi!", "hi!");
        student3.login("hi!", "student");
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        student3.setVerified(false);
        student3.logout();
        student3.viewProfile();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getPassword();
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.setVerified(true);
        student3.logout();
        student3.viewProfile();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getPassword();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        model.Student student3 = new model.Student("hi!", "", "student");
        java.lang.String str4 = student3.getPassword();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getPassword();
        double double7 = student3.getHourlyRate();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        student3.logout();
        java.lang.String str7 = student3.getEmail();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        boolean boolean14 = student3.isVerified();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        student3.logout();
        student3.logout();
        java.lang.String str15 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        boolean boolean8 = student3.isVerified();
        student3.logout();
        double double10 = student3.getHourlyRate();
        student3.logout();
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getID();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getEmail();
        student3.login("", "student");
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        boolean boolean13 = student3.isVerified();
        student3.login("", "hi!");
        student3.viewProfile();
        boolean boolean18 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getEmail();
        student3.logout();
        double double14 = student3.getHourlyRate();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getPassword();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.viewProfile();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        student3.viewProfile();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        double double11 = student3.getHourlyRate();
        double double12 = student3.getHourlyRate();
        student3.login("hi!", "");
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        student3.login("student", "");
        student3.login("student", "");
        student3.logout();
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.login("hi!", "student");
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getEmail();
        student3.login("hi!", "");
        student3.viewProfile();
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
        model.Student student3 = new model.Student("student", "hi!", "");
        student3.login("hi!", "hi!");
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.login("", "");
        student3.logout();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        java.lang.String str11 = student3.getEmail();
        double double12 = student3.getHourlyRate();
        student3.login("student", "student");
        java.lang.String str16 = student3.getID();
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getPassword();
        student3.logout();
        java.lang.String str12 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        student3.login("hi!", "hi!");
        boolean boolean9 = student3.isVerified();
        student3.setVerified(true);
        student3.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        model.Student student3 = new model.Student("student", "hi!", "");
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getEmail();
        student3.viewProfile();
        student3.login("hi!", "");
        java.lang.String str20 = student3.getAccountType();
        java.lang.String str21 = student3.getPassword();
        java.lang.String str22 = student3.getID();
        double double23 = student3.getHourlyRate();
        java.lang.String str24 = student3.getAccountType();
        student3.logout();
        java.lang.Class<?> wildcardClass26 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "student" + "'", str24, "student");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getID();
        student3.login("", "hi!");
        student3.setVerified(false);
        boolean boolean13 = student3.isVerified();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        java.lang.String str17 = student3.getID();
        student3.viewProfile();
        student3.logout();
        java.lang.String str20 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(false);
        student3.logout();
        boolean boolean11 = student3.isVerified();
        student3.login("", "student");
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getAccountType();
        student3.login("student", "student");
        double double10 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str15 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        student3.login("hi!", "hi!");
        java.lang.String str11 = student3.getEmail();
        student3.login("student", "hi!");
        student3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        student3.logout();
        boolean boolean12 = student3.isVerified();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getPassword();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getPassword();
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getAccountType();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        student3.login("", "hi!");
        double double15 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.String str19 = student3.getID();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        student3.logout();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getAccountType();
        student3.login("hi!", "hi!");
        java.lang.String str20 = student3.getID();
        java.lang.String str21 = student3.getID();
        java.lang.String str22 = student3.getPassword();
        java.lang.Class<?> wildcardClass23 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        student3.login("", "student");
        student3.setVerified(true);
        java.lang.String str19 = student3.getPassword();
        java.lang.String str20 = student3.getID();
        java.lang.String str21 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        double double11 = student3.getHourlyRate();
        student3.setVerified(true);
        double double14 = student3.getHourlyRate();
        boolean boolean15 = student3.isVerified();
        boolean boolean16 = student3.isVerified();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(false);
        student3.viewProfile();
        student3.setVerified(true);
        student3.login("hi!", "hi!");
        student3.setVerified(false);
        double double19 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(true);
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getPassword();
        student3.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str13 = student3.getID();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str20 = student3.getEmail();
        java.lang.String str21 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        student3.viewProfile();
        java.lang.String str11 = student3.getPassword();
        student3.viewProfile();
        student3.login("", "");
        student3.login("hi!", "student");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getEmail();
        student3.logout();
        double double16 = student3.getHourlyRate();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getAccountType();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str20 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(true);
        student3.login("", "");
        java.lang.String str15 = student3.getPassword();
        double double16 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        model.Student student3 = new model.Student("", "student", "");
        java.lang.String str4 = student3.getPassword();
        java.lang.String str5 = student3.getEmail();
        student3.logout();
        java.lang.String str7 = student3.getID();
        java.lang.Class<?> wildcardClass8 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.login("", "student");
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getEmail();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getEmail();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        student3.login("hi!", "");
        student3.setVerified(true);
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str7 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.viewProfile();
        double double9 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        student3.setVerified(false);
        java.lang.String str15 = student3.getPassword();
        student3.setVerified(true);
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getPassword();
        java.lang.String str20 = student3.getID();
        student3.login("student", "hi!");
        student3.logout();
        java.lang.Class<?> wildcardClass25 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getID();
        student3.login("", "");
        java.lang.String str12 = student3.getID();
        student3.logout();
        student3.viewProfile();
        double double15 = student3.getHourlyRate();
        boolean boolean16 = student3.isVerified();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.logout();
        double double14 = student3.getHourlyRate();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        double double7 = student3.getHourlyRate();
        student3.login("student", "student");
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getAccountType();
        student3.viewProfile();
        student3.login("student", "");
        boolean boolean19 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        model.Student student3 = new model.Student("", "student", "student");
        student3.setVerified(true);
        java.lang.String str6 = student3.getPassword();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getPassword();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        java.lang.String str12 = student3.getID();
        student3.login("", "hi!");
        double double16 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str18 = student3.getID();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        student3.viewProfile();
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getEmail();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean16 = student3.isVerified();
        student3.login("student", "");
        java.lang.String str20 = student3.getID();
        double double21 = student3.getHourlyRate();
        student3.login("", "hi!");
        java.lang.Class<?> wildcardClass25 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        student3.viewProfile();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getPassword();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str18 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getAccountType();
        double double11 = student3.getHourlyRate();
        double double12 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        student3.logout();
        java.lang.String str12 = student3.getAccountType();
        student3.login("hi!", "student");
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getID();
        student3.viewProfile();
        student3.setVerified(false);
        boolean boolean21 = student3.isVerified();
        java.lang.String str22 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getPassword();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.login("student", "hi!");
        student3.viewProfile();
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        student3.setVerified(false);
        student3.login("student", "hi!");
        java.lang.String str12 = student3.getAccountType();
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getEmail();
        student3.login("", "student");
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getID();
        student3.login("student", "");
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        double double9 = student3.getHourlyRate();
        double double10 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.login("", "student");
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getEmail();
        double double12 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str16 = student3.getID();
        student3.viewProfile();
        java.lang.String str18 = student3.getPassword();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.logout();
        java.lang.String str15 = student3.getAccountType();
        student3.login("", "hi!");
        java.lang.String str19 = student3.getID();
        student3.logout();
        boolean boolean21 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.viewProfile();
        student3.login("", "");
        student3.logout();
        java.lang.String str13 = student3.getID();
        boolean boolean14 = student3.isVerified();
        student3.login("student", "student");
        double double18 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getID();
        student3.login("", "");
        java.lang.String str12 = student3.getID();
        student3.logout();
        student3.viewProfile();
        student3.login("", "");
        double double18 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
        model.Student student3 = new model.Student("hi!", "hi!", "student");
        student3.login("hi!", "hi!");
        student3.logout();
        boolean boolean8 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        boolean boolean9 = student3.isVerified();
        student3.setVerified(true);
        java.lang.String str12 = student3.getEmail();
        student3.logout();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        student3.login("hi!", "student");
        student3.setVerified(true);
        student3.viewProfile();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.login("", "student");
        student3.setVerified(true);
        student3.viewProfile();
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.login("", "student");
        java.lang.String str11 = student3.getID();
        boolean boolean12 = student3.isVerified();
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getEmail();
        student3.viewProfile();
        student3.login("hi!", "");
        java.lang.String str20 = student3.getEmail();
        java.lang.String str21 = student3.getID();
        java.lang.String str22 = student3.getPassword();
        java.lang.String str23 = student3.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "student" + "'", str23, "student");
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.logout();
        double double11 = student3.getHourlyRate();
        double double12 = student3.getHourlyRate();
        double double13 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getID();
        boolean boolean14 = student3.isVerified();
        student3.setVerified(true);
        double double17 = student3.getHourlyRate();
        student3.logout();
        double double19 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getPassword();
        student3.logout();
        java.lang.String str15 = student3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "hi!");
        double double12 = student3.getHourlyRate();
        boolean boolean13 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str9 = student3.getID();
        boolean boolean10 = student3.isVerified();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str14 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.login("", "student");
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        student3.logout();
        java.lang.String str14 = student3.getID();
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
        model.Student student3 = new model.Student("hi!", "hi!", "hi!");
        student3.login("hi!", "student");
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        student3.viewProfile();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.logout();
        student3.logout();
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        double double10 = student3.getHourlyRate();
        student3.setVerified(true);
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getEmail();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        double double7 = student3.getHourlyRate();
        student3.login("student", "hi!");
        double double11 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        double double4 = student3.getHourlyRate();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getEmail();
        student3.login("", "student");
        boolean boolean10 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        model.Student student3 = new model.Student("", "student", "");
        student3.login("student", "");
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        boolean boolean12 = student3.isVerified();
        student3.setVerified(false);
        student3.login("hi!", "student");
        boolean boolean18 = student3.isVerified();
        double double19 = student3.getHourlyRate();
        java.lang.String str20 = student3.getID();
        java.lang.Class<?> wildcardClass21 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        student3.setVerified(false);
        boolean boolean15 = student3.isVerified();
        student3.setVerified(true);
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.logout();
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.login("student", "hi!");
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getAccountType();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getAccountType();
        student3.login("hi!", "hi!");
        java.lang.String str20 = student3.getEmail();
        java.lang.String str21 = student3.getEmail();
        java.lang.String str22 = student3.getEmail();
        boolean boolean23 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getID();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getEmail();
        student3.logout();
        boolean boolean14 = student3.isVerified();
        student3.setVerified(true);
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.login("", "student");
        double double9 = student3.getHourlyRate();
        student3.login("hi!", "");
        java.lang.String str13 = student3.getPassword();
        student3.logout();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "hi!");
        student3.login("", "hi!");
        boolean boolean15 = student3.isVerified();
        student3.logout();
        boolean boolean17 = student3.isVerified();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str14 = student3.getPassword();
        student3.viewProfile();
        boolean boolean16 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getID();
        boolean boolean16 = student3.isVerified();
        student3.viewProfile();
        student3.login("", "student");
        double double21 = student3.getHourlyRate();
        java.lang.String str22 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        student3.viewProfile();
        student3.login("hi!", "hi!");
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getID();
        double double18 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        student3.login("", "student");
        student3.logout();
        java.lang.String str15 = student3.getEmail();
        student3.login("", "hi!");
        java.lang.String str19 = student3.getEmail();
        java.lang.String str20 = student3.getEmail();
        java.lang.String str21 = student3.getID();
        java.lang.String str22 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getAccountType();
        boolean boolean10 = student3.isVerified();
        boolean boolean11 = student3.isVerified();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        student3.logout();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        double double7 = student3.getHourlyRate();
        student3.viewProfile();
        boolean boolean9 = student3.isVerified();
        student3.viewProfile();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str13 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getPassword();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getEmail();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        student3.login("", "hi!");
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str19 = student3.getAccountType();
        java.lang.String str20 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str13 = student3.getID();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getPassword();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        model.Student student3 = new model.Student("", "student", "");
        java.lang.String str4 = student3.getPassword();
        java.lang.String str5 = student3.getEmail();
        student3.login("student", "student");
        java.lang.String str9 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        student3.setVerified(false);
        double double15 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        student3.setVerified(false);
        boolean boolean7 = student3.isVerified();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.login("", "student");
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getAccountType();
        student3.login("hi!", "");
        java.lang.String str12 = student3.getAccountType();
        boolean boolean13 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        model.Student student3 = new model.Student("", "", "");
        student3.viewProfile();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getEmail();
        student3.login("hi!", "hi!");
        boolean boolean10 = student3.isVerified();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(true);
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.login("", "student");
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        java.lang.String str13 = student3.getPassword();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        student3.viewProfile();
        student3.login("hi!", "student");
        java.lang.Class<?> wildcardClass10 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        model.Student student3 = new model.Student("", "student", "student");
        student3.setVerified(true);
        java.lang.String str6 = student3.getPassword();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        boolean boolean14 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        student3.login("hi!", "");
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str21 = student3.getID();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getPassword();
        double double17 = student3.getHourlyRate();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean12 = student3.isVerified();
        student3.setVerified(false);
        student3.logout();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getAccountType();
        student3.logout();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getID();
        java.lang.Class<?> wildcardClass9 = student3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
        model.Student student3 = new model.Student("student", "student", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getID();
        student3.login("student", "hi!");
        student3.login("", "");
        java.lang.String str13 = student3.getID();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getID();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.setVerified(false);
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        double double9 = student3.getHourlyRate();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        student3.login("student", "student");
        boolean boolean14 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getID();
        boolean boolean16 = student3.isVerified();
        student3.viewProfile();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getAccountType();
        boolean boolean14 = student3.isVerified();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getPassword();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        boolean boolean13 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.login("", "hi!");
        java.lang.String str11 = student3.getEmail();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        java.lang.String str8 = student3.getAccountType();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str11 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        model.Student student3 = new model.Student("hi!", "", "student");
        java.lang.String str4 = student3.getPassword();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        student3.login("student", "");
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        double double7 = student3.getHourlyRate();
        student3.setVerified(true);
        double double10 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        boolean boolean11 = student3.isVerified();
        student3.login("student", "student");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.login("hi!", "");
        student3.login("hi!", "");
        student3.viewProfile();
        java.lang.String str15 = student3.getAccountType();
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(true);
        student3.login("student", "");
        java.lang.String str9 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        double double12 = student3.getHourlyRate();
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str16 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        student3.login("", "student");
        java.lang.String str8 = student3.getPassword();
        double double9 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        model.Student student3 = new model.Student("", "", "");
        student3.viewProfile();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getAccountType();
        student3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        student3.login("", "hi!");
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getAccountType();
        student3.login("", "student");
        student3.setVerified(false);
        java.lang.String str21 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        student3.viewProfile();
        student3.login("hi!", "student");
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getAccountType();
        student3.setVerified(false);
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass9 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getPassword();
        student3.logout();
        student3.login("", "hi!");
        student3.setVerified(true);
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(false);
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str9 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str11 = student3.getID();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getPassword();
        student3.logout();
        student3.viewProfile();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        double double11 = student3.getHourlyRate();
        student3.setVerified(true);
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        double double10 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str12 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str7 = student3.getID();
        student3.logout();
        java.lang.String str9 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        student3.viewProfile();
        student3.login("hi!", "");
        boolean boolean14 = student3.isVerified();
        student3.logout();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.login("student", "student");
        java.lang.String str11 = student3.getAccountType();
        student3.viewProfile();
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        student3.logout();
        student3.login("", "student");
        java.lang.String str15 = student3.getID();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getAccountType();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        model.Student student3 = new model.Student("hi!", "hi!", "hi!");
        student3.login("hi!", "student");
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.logout();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.login("hi!", "");
        student3.logout();
        double double14 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str17 = student3.getEmail();
        student3.login("student", "student");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.login("", "");
        student3.setVerified(false);
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        java.lang.String str10 = student3.getPassword();
        student3.login("", "");
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getPassword();
        double double16 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getID();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        boolean boolean8 = student3.isVerified();
        student3.login("", "");
        java.lang.String str12 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getEmail();
        double double16 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str19 = student3.getID();
        java.lang.String str20 = student3.getPassword();
        java.lang.String str21 = student3.getAccountType();
        java.lang.Class<?> wildcardClass22 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.viewProfile();
        student3.viewProfile();
        double double6 = student3.getHourlyRate();
        student3.login("", "");
        java.lang.String str10 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.viewProfile();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getAccountType();
        boolean boolean9 = student3.isVerified();
        java.lang.Class<?> wildcardClass10 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.login("hi!", "");
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getPassword();
        student3.logout();
        student3.logout();
        student3.logout();
        boolean boolean18 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        model.Student student3 = new model.Student("", "student", "student");
        student3.setVerified(true);
        java.lang.String str6 = student3.getPassword();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        student3.login("hi!", "hi!");
        java.lang.String str16 = student3.getPassword();
        student3.setVerified(true);
        java.lang.String str19 = student3.getAccountType();
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        double double18 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str21 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        java.lang.String str8 = student3.getAccountType();
        student3.viewProfile();
        student3.viewProfile();
        student3.login("student", "hi!");
        java.lang.String str14 = student3.getPassword();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        student3.logout();
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        boolean boolean14 = student3.isVerified();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        model.Student student3 = new model.Student("", "student", "");
        student3.setVerified(true);
        student3.logout();
        student3.setVerified(true);
        student3.logout();
        student3.login("", "student");
        java.lang.String str13 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getPassword();
        student3.setVerified(true);
        student3.logout();
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        student3.viewProfile();
        student3.login("student", "");
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.setVerified(false);
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getID();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.logout();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getEmail();
        double double17 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        student3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
        model.Student student3 = new model.Student("", "student", "student");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        student3.logout();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getAccountType();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "hi!");
        student3.login("", "hi!");
        boolean boolean15 = student3.isVerified();
        student3.logout();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getID();
        student3.login("student", "hi!");
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.logout();
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.login("student", "hi!");
        java.lang.String str15 = student3.getAccountType();
        double double16 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getPassword();
        student3.logout();
        student3.setVerified(false);
        double double16 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str19 = student3.getID();
        student3.setVerified(false);
        java.lang.String str22 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        student3.logout();
        java.lang.String str6 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        boolean boolean8 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        java.lang.String str12 = student3.getEmail();
        student3.logout();
        double double14 = student3.getHourlyRate();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        student3.login("student", "student");
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getEmail();
        student3.login("hi!", "student");
        java.lang.String str18 = student3.getPassword();
        boolean boolean19 = student3.isVerified();
        student3.viewProfile();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str9 = student3.getEmail();
        double double10 = student3.getHourlyRate();
        double double11 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.login("", "student");
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        student3.setVerified(false);
        java.lang.String str15 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        student3.viewProfile();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        student3.logout();
        java.lang.String str14 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        double double11 = student3.getHourlyRate();
        boolean boolean12 = student3.isVerified();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        student3.login("hi!", "hi!");
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        student3.viewProfile();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getPassword();
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        java.lang.String str14 = student3.getEmail();
        boolean boolean15 = student3.isVerified();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getAccountType();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str13 = student3.getPassword();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "student");
        student3.setVerified(true);
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getEmail();
        student3.logout();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        model.Student student3 = new model.Student("student", "hi!", "hi!");
        java.lang.String str4 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        student3.setVerified(true);
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.login("hi!", "student");
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getPassword();
        double double14 = student3.getHourlyRate();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        model.Student student3 = new model.Student("", "student", "student");
        student3.setVerified(true);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        double double9 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getID();
        double double12 = student3.getHourlyRate();
        double double13 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean12 = student3.isVerified();
        student3.logout();
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(true);
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        boolean boolean13 = student3.isVerified();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        student3.setVerified(false);
        student3.viewProfile();
        student3.login("", "hi!");
        java.lang.String str20 = student3.getPassword();
        java.lang.String str21 = student3.getPassword();
        boolean boolean22 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getID();
        student3.login("", "student");
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getEmail();
        student3.login("student", "student");
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        model.Student student3 = new model.Student("student", "hi!", "");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getPassword();
        java.lang.String str6 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str9 = student3.getEmail();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str13 = student3.getID();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.setVerified(true);
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        java.lang.String str18 = student3.getID();
        student3.setVerified(true);
        double double21 = student3.getHourlyRate();
        java.lang.String str22 = student3.getAccountType();
        java.lang.String str23 = student3.getID();
        java.lang.Class<?> wildcardClass24 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getID();
        student3.viewProfile();
        student3.setVerified(true);
        boolean boolean16 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        boolean boolean10 = student3.isVerified();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getPassword();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getID();
        student3.login("hi!", "hi!");
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        model.Student student3 = new model.Student("", "hi!", "student");
        java.lang.String str4 = student3.getPassword();
        java.lang.Class<?> wildcardClass5 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "student");
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getID();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getID();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.setVerified(false);
        boolean boolean11 = student3.isVerified();
        student3.login("student", "");
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        double double10 = student3.getHourlyRate();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.setVerified(false);
        boolean boolean10 = student3.isVerified();
        student3.logout();
        student3.logout();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getID();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        student3.login("student", "hi!");
        java.lang.String str15 = student3.getPassword();
        double double16 = student3.getHourlyRate();
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getID();
        student3.logout();
        java.lang.String str20 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        student3.logout();
        student3.logout();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getID();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        student3.logout();
        boolean boolean12 = student3.isVerified();
        double double13 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(false);
        double double17 = student3.getHourlyRate();
        java.lang.String str18 = student3.getEmail();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
        model.Student student3 = new model.Student("", "student", "hi!");
        java.lang.String str4 = student3.getPassword();
        java.lang.String str5 = student3.getPassword();
        double double6 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        boolean boolean13 = student3.isVerified();
        double double14 = student3.getHourlyRate();
        boolean boolean15 = student3.isVerified();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str16 = student3.getID();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str9 = student3.getEmail();
        student3.logout();
        java.lang.String str11 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str13 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getPassword();
        double double16 = student3.getHourlyRate();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        boolean boolean5 = student3.isVerified();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str11 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        student3.login("", "");
        java.lang.String str15 = student3.getPassword();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getID();
        student3.viewProfile();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        student3.login("", "");
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getAccountType();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        model.Student student3 = new model.Student("", "student", "hi!");
        java.lang.String str4 = student3.getPassword();
        java.lang.String str5 = student3.getPassword();
        student3.logout();
        java.lang.String str7 = student3.getEmail();
        double double8 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        student3.logout();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(false);
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getID();
        double double17 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "");
        boolean boolean12 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.login("", "student");
        boolean boolean11 = student3.isVerified();
        double double12 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        student3.login("hi!", "student");
        student3.setVerified(true);
        student3.viewProfile();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getEmail();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(false);
        student3.login("", "hi!");
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getAccountType();
        boolean boolean19 = student3.isVerified();
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        student3.setVerified(false);
        student3.viewProfile();
        boolean boolean15 = student3.isVerified();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        student3.logout();
        student3.login("", "student");
        java.lang.String str15 = student3.getID();
        boolean boolean16 = student3.isVerified();
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        student3.logout();
        student3.viewProfile();
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getID();
        boolean boolean12 = student3.isVerified();
        double double13 = student3.getHourlyRate();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.login("hi!", "hi!");
        student3.setVerified(false);
        double double16 = student3.getHourlyRate();
        student3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
        model.Student student3 = new model.Student("", "student", "student");
        java.lang.String str4 = student3.getAccountType();
        student3.logout();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.logout();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        double double19 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getEmail();
        double double14 = student3.getHourlyRate();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        double double9 = student3.getHourlyRate();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getID();
        boolean boolean9 = student3.isVerified();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getPassword();
        student3.viewProfile();
        student3.login("", "");
        java.lang.String str9 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        student3.viewProfile();
        student3.logout();
        student3.login("student", "student");
        java.lang.String str18 = student3.getPassword();
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getAccountType();
        student3.login("hi!", "");
        student3.viewProfile();
        student3.logout();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        student3.setVerified(false);
        double double15 = student3.getHourlyRate();
        double double16 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        student3.login("student", "student");
        boolean boolean17 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str20 = student3.getAccountType();
        java.lang.String str21 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        student3.viewProfile();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.setVerified(true);
        double double12 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(false);
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getEmail();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getPassword();
        boolean boolean16 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.logout();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        student3.login("student", "student");
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        model.Student student3 = new model.Student("", "hi!", "hi!");
        student3.login("student", "student");
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getAccountType();
        student3.logout();
        java.lang.String str11 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getID();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getPassword();
        student3.logout();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        double double4 = student3.getHourlyRate();
        student3.logout();
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        student3.viewProfile();
        boolean boolean14 = student3.isVerified();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        student3.login("student", "student");
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getPassword();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getAccountType();
        student3.login("", "hi!");
        student3.viewProfile();
        java.lang.String str20 = student3.getID();
        java.lang.String str21 = student3.getEmail();
        java.lang.String str22 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        boolean boolean14 = student3.isVerified();
        double double15 = student3.getHourlyRate();
        student3.viewProfile();
        student3.logout();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        java.lang.String str13 = student3.getPassword();
        student3.logout();
        double double15 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.logout();
        double double14 = student3.getHourlyRate();
        double double15 = student3.getHourlyRate();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        model.Student student3 = new model.Student("hi!", "hi!", "student");
        student3.login("hi!", "student");
        student3.login("", "student");
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        double double18 = student3.getHourlyRate();
        boolean boolean19 = student3.isVerified();
        student3.setVerified(true);
        java.lang.String str22 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        student3.login("", "hi!");
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        student3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        student3.login("student", "student");
        student3.login("student", "");
        boolean boolean19 = student3.isVerified();
        student3.logout();
        student3.viewProfile();
        java.lang.String str22 = student3.getEmail();
        java.lang.Class<?> wildcardClass23 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        boolean boolean13 = student3.isVerified();
        student3.login("student", "hi!");
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getEmail();
        double double14 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        double double9 = student3.getHourlyRate();
        boolean boolean10 = student3.isVerified();
        student3.login("hi!", "");
        student3.viewProfile();
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.login("hi!", "");
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        boolean boolean10 = student3.isVerified();
        boolean boolean11 = student3.isVerified();
        boolean boolean12 = student3.isVerified();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getPassword();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "hi!");
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getEmail();
        student3.logout();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getEmail();
        student3.login("hi!", "student");
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
        model.Student student3 = new model.Student("", "student", "");
        student3.setVerified(true);
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(false);
        student3.setVerified(false);
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        double double11 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        student3.setVerified(false);
        student3.logout();
        student3.logout();
        java.lang.String str17 = student3.getPassword();
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        double double11 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.login("hi!", "hi!");
        java.lang.String str17 = student3.getAccountType();
        double double18 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str11 = student3.getPassword();
        student3.viewProfile();
        boolean boolean13 = student3.isVerified();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        student3.login("", "");
        java.lang.String str15 = student3.getPassword();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getPassword();
        student3.login("hi!", "");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str12 = student3.getEmail();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getAccountType();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.login("hi!", "");
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getPassword();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        java.lang.String str13 = student3.getAccountType();
        student3.login("", "hi!");
        student3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getEmail();
        double double9 = student3.getHourlyRate();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getEmail();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        java.lang.String str8 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "hi!");
        java.lang.String str16 = student3.getID();
        student3.viewProfile();
        java.lang.String str18 = student3.getAccountType();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        student3.login("", "");
        java.lang.String str15 = student3.getPassword();
        double double16 = student3.getHourlyRate();
        student3.login("hi!", "");
        java.lang.String str20 = student3.getAccountType();
        student3.login("", "hi!");
        double double24 = student3.getHourlyRate();
        java.lang.String str25 = student3.getAccountType();
        java.lang.Class<?> wildcardClass26 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "student" + "'", str25, "student");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getID();
        student3.login("", "student");
        student3.logout();
        boolean boolean19 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        double double15 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.setVerified(false);
        boolean boolean11 = student3.isVerified();
        student3.logout();
        student3.login("hi!", "student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getPassword();
        student3.viewProfile();
        double double16 = student3.getHourlyRate();
        boolean boolean17 = student3.isVerified();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str15 = student3.getAccountType();
        student3.logout();
        java.lang.String str17 = student3.getAccountType();
        java.lang.String str18 = student3.getAccountType();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getPassword();
        student3.login("student", "");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.login("", "");
        java.lang.String str16 = student3.getID();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str19 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str21 = student3.getID();
        student3.viewProfile();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.logout();
        student3.logout();
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        double double15 = student3.getHourlyRate();
        double double16 = student3.getHourlyRate();
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        model.Student student3 = new model.Student("student", "hi!", "hi!");
        java.lang.String str4 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean7 = student3.isVerified();
        student3.login("hi!", "");
        student3.logout();
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        java.lang.String str5 = student3.getAccountType();
        student3.logout();
        java.lang.String str7 = student3.getPassword();
        student3.logout();
        student3.viewProfile();
        student3.login("hi!", "");
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
        model.Student student3 = new model.Student("hi!", "student", "student");
        double double4 = student3.getHourlyRate();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getID();
        student3.login("student", "hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        student3.login("", "hi!");
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getAccountType();
        student3.login("", "student");
        student3.setVerified(false);
        double double21 = student3.getHourlyRate();
        boolean boolean22 = student3.isVerified();
        java.lang.String str23 = student3.getPassword();
        boolean boolean24 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        boolean boolean9 = student3.isVerified();
        student3.login("", "student");
        student3.setVerified(true);
        student3.login("student", "hi!");
        java.lang.String str18 = student3.getAccountType();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        student3.logout();
        student3.viewProfile();
        java.lang.String str13 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean15 = student3.isVerified();
        student3.login("student", "student");
        student3.login("", "hi!");
        java.lang.String str22 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        double double8 = student3.getHourlyRate();
        student3.login("student", "student");
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        student3.viewProfile();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getAccountType();
        student3.login("student", "");
        double double20 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getID();
        student3.viewProfile();
        java.lang.String str16 = student3.getID();
        double double17 = student3.getHourlyRate();
        java.lang.String str18 = student3.getEmail();
        student3.logout();
        boolean boolean20 = student3.isVerified();
        boolean boolean21 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getAccountType();
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        student3.login("student", "");
        student3.setVerified(true);
        student3.login("", "hi!");
        boolean boolean16 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean12 = student3.isVerified();
        student3.setVerified(false);
        student3.logout();
        boolean boolean16 = student3.isVerified();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        student3.setVerified(false);
        java.lang.String str15 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str17 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str20 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        student3.login("student", "hi!");
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getEmail();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str14 = student3.getEmail();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        model.Student student3 = new model.Student("hi!", "hi!", "student");
        student3.login("hi!", "student");
        student3.login("", "student");
        student3.setVerified(false);
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getAccountType();
        boolean boolean14 = student3.isVerified();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }
}

