import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "");
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str14 = faculty3.getID();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getPassword();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        boolean boolean11 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        double double15 = faculty3.getHourlyRate();
        faculty3.logout();
        boolean boolean17 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        boolean boolean9 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.login("hi!", "");
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        boolean boolean10 = faculty3.isVerified();
        boolean boolean11 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str8 = faculty3.getID();
        boolean boolean9 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        boolean boolean8 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        double double7 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        double double11 = faculty3.getHourlyRate();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.login("", "faculty");
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.String str16 = faculty3.getID();
        boolean boolean17 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        java.lang.Class<?> wildcardClass23 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        faculty3.login("faculty", "");
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.login("", "");
        faculty3.setVerified(false);
        faculty3.logout();
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        java.lang.String str15 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.login("faculty", "");
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(false);
        boolean boolean15 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getID();
        boolean boolean12 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        faculty3.viewProfile();
        boolean boolean16 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str17 = faculty3.getEmail();
        faculty3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("hi!", "hi!");
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getID();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.login("", "faculty");
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.login("hi!", "");
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        double double9 = faculty3.getHourlyRate();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.setVerified(false);
        java.lang.String str14 = faculty3.getID();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "");
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getEmail();
        boolean boolean13 = faculty3.isVerified();
        double double14 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("", "hi!");
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.viewProfile();
        double double17 = faculty3.getHourlyRate();
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.viewProfile();
        boolean boolean12 = faculty3.isVerified();
        faculty3.login("", "");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getPassword();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getEmail();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "hi!");
        java.lang.String str4 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass5 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        faculty3.logout();
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getPassword();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getPassword();
        boolean boolean13 = faculty3.isVerified();
        double double14 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "hi!");
        faculty3.login("faculty", "faculty");
        faculty3.setVerified(false);
        faculty3.login("", "");
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getPassword();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getPassword();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getAccountType();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.login("faculty", "");
        java.lang.String str18 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.viewProfile();
        boolean boolean16 = faculty3.isVerified();
        double double17 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("", "hi!");
        double double13 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.login("faculty", "");
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean16 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.login("", "");
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getAccountType();
        boolean boolean13 = faculty3.isVerified();
        double double14 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "");
        java.lang.Class<?> wildcardClass4 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "faculty");
        faculty3.login("hi!", "hi!");
        java.lang.String str7 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.viewProfile();
        boolean boolean14 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getEmail();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.logout();
        double double11 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "hi!");
        faculty3.login("faculty", "faculty");
        faculty3.setVerified(false);
        boolean boolean9 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.login("", "faculty");
        faculty3.logout();
        double double19 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "faculty");
        java.lang.String str4 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str6 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str16 = faculty3.getID();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.viewProfile();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getID();
        java.lang.Class<?> wildcardClass7 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass8 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getPassword();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        faculty3.login("", "faculty");
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getID();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getPassword();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("", "");
        double double15 = faculty3.getHourlyRate();
        boolean boolean16 = faculty3.isVerified();
        faculty3.logout();
        boolean boolean18 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str20 = faculty3.getAccountType();
        faculty3.login("hi!", "");
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getID();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "hi!");
        double double4 = faculty3.getHourlyRate();
        boolean boolean5 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getID();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getAccountType();
        double double12 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.login("", "faculty");
        faculty3.setVerified(true);
        java.lang.String str19 = faculty3.getPassword();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        java.lang.String str14 = faculty3.getPassword();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        faculty3.login("hi!", "hi!");
        java.lang.String str22 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass24 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        boolean boolean15 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.viewProfile();
        double double14 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        double double11 = faculty3.getHourlyRate();
        faculty3.login("", "hi!");
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        faculty3.login("faculty", "faculty");
        java.lang.String str13 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str16 = faculty3.getID();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.login("faculty", "faculty");
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("", "hi!");
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getAccountType();
        double double16 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        boolean boolean10 = faculty3.isVerified();
        boolean boolean11 = faculty3.isVerified();
        boolean boolean12 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("hi!", "");
        java.lang.String str20 = faculty3.getEmail();
        java.lang.String str21 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str23 = faculty3.getAccountType();
        faculty3.setVerified(false);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.setVerified(true);
        double double8 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("faculty", "faculty");
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getID();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.login("", "");
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        double double12 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str10 = faculty3.getID();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.login("", "faculty");
        boolean boolean18 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        faculty3.setVerified(true);
        java.lang.String str6 = faculty3.getPassword();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getPassword();
        double double9 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        boolean boolean11 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        faculty3.setVerified(true);
        java.lang.String str6 = faculty3.getPassword();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.logout();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        double double11 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean8 = faculty3.isVerified();
        boolean boolean9 = faculty3.isVerified();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        boolean boolean9 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("", "hi!");
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        faculty3.viewProfile();
        double double17 = faculty3.getHourlyRate();
        java.lang.String str18 = faculty3.getPassword();
        java.lang.String str19 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str17 = faculty3.getEmail();
        double double18 = faculty3.getHourlyRate();
        java.lang.String str19 = faculty3.getEmail();
        double double20 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getID();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.viewProfile();
        boolean boolean7 = faculty3.isVerified();
        double double8 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getEmail();
        double double14 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.viewProfile();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getID();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean9 = faculty3.isVerified();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        boolean boolean13 = faculty3.isVerified();
        faculty3.login("faculty", "hi!");
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getEmail();
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getPassword();
        boolean boolean19 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getID();
        boolean boolean12 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getEmail();
        double double14 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.login("faculty", "faculty");
        java.lang.String str17 = faculty3.getID();
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getID();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        boolean boolean13 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str13 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getID();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass22 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "faculty");
        java.lang.String str4 = faculty3.getID();
        faculty3.setVerified(true);
        double double7 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getAccountType();
        double double10 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass8 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        faculty3.logout();
        boolean boolean13 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        java.lang.String str20 = faculty3.getAccountType();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        double double8 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str10 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getID();
        faculty3.logout();
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("", "");
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "hi!");
        faculty3.login("faculty", "faculty");
        faculty3.login("hi!", "hi!");
        boolean boolean10 = faculty3.isVerified();
        double double11 = faculty3.getHourlyRate();
        faculty3.login("", "");
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getID();
        double double14 = faculty3.getHourlyRate();
        faculty3.login("faculty", "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(false);
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "faculty");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.login("", "hi!");
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getPassword();
        double double15 = faculty3.getHourlyRate();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getAccountType();
        faculty3.login("faculty", "hi!");
        java.lang.String str24 = faculty3.getID();
        java.lang.Class<?> wildcardClass25 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.setVerified(true);
        java.lang.String str15 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.Class<?> wildcardClass8 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getID();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        double double8 = faculty3.getHourlyRate();
        faculty3.login("", "");
        double double12 = faculty3.getHourlyRate();
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        java.lang.String str20 = faculty3.getAccountType();
        java.lang.String str21 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass22 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        faculty3.login("faculty", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        faculty3.viewProfile();
        double double17 = faculty3.getHourlyRate();
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getEmail();
        boolean boolean7 = faculty3.isVerified();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        double double13 = faculty3.getHourlyRate();
        boolean boolean14 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        boolean boolean11 = faculty3.isVerified();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getPassword();
        faculty3.setVerified(true);
        double double18 = faculty3.getHourlyRate();
        java.lang.String str19 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str23 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass7 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        faculty3.setVerified(true);
        double double17 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.login("", "");
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getPassword();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str9 = faculty3.getEmail();
        double double10 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getPassword();
        boolean boolean16 = faculty3.isVerified();
        boolean boolean17 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean8 = faculty3.isVerified();
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getID();
        faculty3.logout();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getID();
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.viewProfile();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str10 = faculty3.getID();
        faculty3.login("faculty", "");
        faculty3.setVerified(false);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getAccountType();
        double double10 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        double double12 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        double double12 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getPassword();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("", "hi!");
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.viewProfile();
        double double11 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        boolean boolean9 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str12 = faculty3.getEmail();
        faculty3.logout();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getEmail();
        double double13 = faculty3.getHourlyRate();
        faculty3.login("", "");
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str13 = faculty3.getID();
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getPassword();
        double double8 = faculty3.getHourlyRate();
        faculty3.login("", "");
        java.lang.String str12 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getID();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getAccountType();
        double double18 = faculty3.getHourlyRate();
        boolean boolean19 = faculty3.isVerified();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        double double11 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.login("hi!", "");
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getAccountType();
        boolean boolean8 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getPassword();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass7 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(false);
        java.lang.String str13 = faculty3.getAccountType();
        boolean boolean14 = faculty3.isVerified();
        faculty3.login("faculty", "faculty");
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getID();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.viewProfile();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        java.lang.String str12 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str14 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "hi!");
        faculty3.login("faculty", "faculty");
        java.lang.String str7 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        double double12 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.setVerified(false);
        double double17 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getPassword();
        boolean boolean16 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.login("hi!", "");
        java.lang.String str18 = faculty3.getPassword();
        double double19 = faculty3.getHourlyRate();
        java.lang.String str20 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass22 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("hi!", "");
        faculty3.logout();
        boolean boolean14 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "faculty");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str12 = faculty3.getID();
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("", "hi!");
        double double15 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.login("faculty", "faculty");
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getID();
        faculty3.login("", "");
        faculty3.setVerified(false);
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "");
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.login("faculty", "hi!");
        boolean boolean17 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getID();
        faculty3.setVerified(false);
        double double13 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("", "faculty");
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        boolean boolean8 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.String str19 = faculty3.getID();
        java.lang.String str20 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        double double15 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getID();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("", "hi!");
        boolean boolean16 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        boolean boolean12 = faculty3.isVerified();
        faculty3.login("", "faculty");
        faculty3.login("", "faculty");
        faculty3.login("", "");
        java.lang.String str22 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getAccountType();
        double double13 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        faculty3.login("", "faculty");
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("hi!", "");
        java.lang.String str20 = faculty3.getAccountType();
        java.lang.String str21 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.login("", "faculty");
        faculty3.login("faculty", "hi!");
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
        boolean boolean11 = faculty3.isVerified();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.login("faculty", "");
        double double20 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass8 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.logout();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getID();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getEmail();
        java.lang.String str19 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.login("faculty", "");
        faculty3.logout();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getID();
        faculty3.login("hi!", "faculty");
        java.lang.String str14 = faculty3.getPassword();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getEmail();
        double double21 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        faculty3.viewProfile();
        boolean boolean15 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "faculty");
        java.lang.String str4 = faculty3.getPassword();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.logout();
        double double14 = faculty3.getHourlyRate();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getID();
        double double17 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getAccountType();
        java.lang.String str21 = faculty3.getAccountType();
        boolean boolean22 = faculty3.isVerified();
        faculty3.logout();
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        double double14 = faculty3.getHourlyRate();
        faculty3.login("hi!", "faculty");
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getEmail();
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getPassword();
        boolean boolean19 = faculty3.isVerified();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass6 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        faculty3.login("hi!", "faculty");
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getID();
        faculty3.login("", "");
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getID();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        boolean boolean13 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        boolean boolean9 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str12 = faculty3.getEmail();
        boolean boolean13 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.login("", "hi!");
        java.lang.String str11 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "faculty");
        faculty3.setVerified(false);
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        faculty3.login("faculty", "");
        boolean boolean7 = faculty3.isVerified();
        boolean boolean8 = faculty3.isVerified();
        boolean boolean9 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        java.lang.String str12 = faculty3.getAccountType();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getAccountType();
        boolean boolean16 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "hi!");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.setVerified(true);
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(true);
        double double18 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(false);
        boolean boolean22 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        java.lang.String str12 = faculty3.getPassword();
        faculty3.setVerified(false);
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getID();
        faculty3.viewProfile();
        boolean boolean18 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.login("hi!", "");
        java.lang.String str13 = faculty3.getAccountType();
        double double14 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getID();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "hi!");
        faculty3.login("faculty", "faculty");
        java.lang.String str7 = faculty3.getID();
        faculty3.logout();
        faculty3.setVerified(true);
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.login("", "");
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        java.lang.String str20 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        faculty3.login("faculty", "faculty");
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getID();
        faculty3.login("", "hi!");
        java.lang.String str18 = faculty3.getID();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getID();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("hi!", "");
        java.lang.String str20 = faculty3.getAccountType();
        java.lang.String str21 = faculty3.getPassword();
        java.lang.String str22 = faculty3.getID();
        faculty3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        double double10 = faculty3.getHourlyRate();
        boolean boolean11 = faculty3.isVerified();
        double double12 = faculty3.getHourlyRate();
        faculty3.login("faculty", "");
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        double double10 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.login("", "");
        java.lang.String str16 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        double double10 = faculty3.getHourlyRate();
        boolean boolean11 = faculty3.isVerified();
        double double12 = faculty3.getHourlyRate();
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        double double15 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.login("", "");
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass24 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str8 = faculty3.getID();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        boolean boolean12 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.login("hi!", "faculty");
        boolean boolean18 = faculty3.isVerified();
        double double19 = faculty3.getHourlyRate();
        java.lang.String str20 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(false);
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        boolean boolean19 = faculty3.isVerified();
        java.lang.String str20 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        double double7 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.login("", "faculty");
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getAccountType();
        double double11 = faculty3.getHourlyRate();
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.login("hi!", "faculty");
        java.lang.String str11 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("hi!", "");
        faculty3.logout();
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        double double8 = faculty3.getHourlyRate();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getAccountType();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass7 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.setVerified(false);
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getEmail();
        double double12 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str14 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        double double5 = faculty3.getHourlyRate();
        faculty3.login("", "faculty");
        java.lang.String str9 = faculty3.getPassword();
        double double10 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        faculty3.login("hi!", "hi!");
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        double double11 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        faculty3.viewProfile();
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getID();
        boolean boolean12 = faculty3.isVerified();
        faculty3.login("", "");
        faculty3.login("", "");
        boolean boolean19 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.login("faculty", "hi!");
        boolean boolean17 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str19 = faculty3.getAccountType();
        boolean boolean20 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.login("", "");
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getAccountType();
        java.lang.String str21 = faculty3.getID();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getID();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getEmail();
        boolean boolean15 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        java.lang.String str7 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getPassword();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getID();
        faculty3.logout();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        java.lang.String str22 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("", "");
        faculty3.logout();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        double double22 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        double double24 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass25 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str11 = faculty3.getEmail();
        faculty3.setVerified(false);
        boolean boolean14 = faculty3.isVerified();
        boolean boolean15 = faculty3.isVerified();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str18 = faculty3.getEmail();
        java.lang.String str19 = faculty3.getAccountType();
        boolean boolean20 = faculty3.isVerified();
        java.lang.String str21 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.login("", "faculty");
        boolean boolean11 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getID();
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(false);
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str19 = faculty3.getID();
        faculty3.setVerified(false);
        double double22 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass23 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        boolean boolean11 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean13 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("", "");
        double double15 = faculty3.getHourlyRate();
        boolean boolean16 = faculty3.isVerified();
        boolean boolean17 = faculty3.isVerified();
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.login("", "faculty");
        faculty3.setVerified(true);
        java.lang.String str19 = faculty3.getPassword();
        java.lang.String str20 = faculty3.getID();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(true);
        double double18 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.login("faculty", "hi!");
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getPassword();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        java.lang.Class<?> wildcardClass8 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        faculty3.logout();
        double double12 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.login("", "");
        java.lang.String str12 = faculty3.getID();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        faculty3.login("", "faculty");
        boolean boolean15 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.login("", "hi!");
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        double double11 = faculty3.getHourlyRate();
        double double12 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getEmail();
        double double14 = faculty3.getHourlyRate();
        double double15 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str8 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str18 = faculty3.getPassword();
        java.lang.String str19 = faculty3.getPassword();
        java.lang.String str20 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str7 = faculty3.getEmail();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        double double13 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getEmail();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getEmail();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("", "");
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getPassword();
        boolean boolean17 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        double double10 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getPassword();
        faculty3.setVerified(true);
        double double18 = faculty3.getHourlyRate();
        faculty3.logout();
        double double20 = faculty3.getHourlyRate();
        java.lang.String str21 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        double double7 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.logout();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        faculty3.login("faculty", "");
        faculty3.logout();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.logout();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getAccountType();
        boolean boolean13 = faculty3.isVerified();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        faculty3.setVerified(false);
        double double7 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str8 = faculty3.getID();
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.login("", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getID();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.logout();
        boolean boolean14 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getPassword();
        faculty3.login("hi!", "");
        faculty3.setVerified(true);
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.login("hi!", "");
        faculty3.setVerified(false);
        double double13 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        faculty3.login("", "");
        faculty3.logout();
        java.lang.String str16 = faculty3.getEmail();
        faculty3.login("hi!", "faculty");
        faculty3.login("faculty", "");
        faculty3.viewProfile();
        boolean boolean24 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        boolean boolean9 = faculty3.isVerified();
        faculty3.login("", "faculty");
        faculty3.setVerified(true);
        faculty3.login("faculty", "hi!");
        faculty3.logout();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str10 = faculty3.getID();
        faculty3.login("faculty", "");
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        java.lang.String str12 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getPassword();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getEmail();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.logout();
        boolean boolean15 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getEmail();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        boolean boolean10 = faculty3.isVerified();
        faculty3.logout();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
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
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getEmail();
        faculty3.setVerified(false);
        java.lang.String str23 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "");
        faculty3.login("hi!", "hi!");
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "");
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.login("", "faculty");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("hi!", "");
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("hi!", "hi!");
        java.lang.String str15 = faculty3.getID();
        faculty3.logout();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass8 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        java.lang.String str15 = faculty3.getPassword();
        faculty3.login("faculty", "");
        faculty3.login("", "hi!");
        faculty3.setVerified(true);
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        faculty3.setVerified(false);
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("faculty", "");
        faculty3.login("", "faculty");
        java.lang.String str19 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        boolean boolean5 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass6 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "");
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.logout();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str12 = faculty3.getPassword();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getID();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        boolean boolean13 = faculty3.isVerified();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.setVerified(true);
        java.lang.String str14 = faculty3.getPassword();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("hi!", "faculty");
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getID();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        double double8 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str15 = faculty3.getPassword();
        boolean boolean16 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        faculty3.login("", "");
        faculty3.logout();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        boolean boolean8 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "");
        faculty3.setVerified(true);
        java.lang.String str6 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        double double10 = faculty3.getHourlyRate();
        boolean boolean11 = faculty3.isVerified();
        double double12 = faculty3.getHourlyRate();
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        double double15 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str17 = faculty3.getPassword();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.viewProfile();
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getEmail();
        faculty3.login("", "");
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "faculty");
        java.lang.String str4 = faculty3.getPassword();
        double double5 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass7 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        faculty3.login("hi!", "hi!");
        java.lang.String str9 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getID();
        boolean boolean18 = faculty3.isVerified();
        java.lang.String str19 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str11 = faculty3.getID();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        boolean boolean13 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getID();
        faculty3.login("", "");
        java.lang.String str12 = faculty3.getID();
        faculty3.logout();
        faculty3.viewProfile();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        faculty3.login("hi!", "faculty");
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.logout();
        double double14 = faculty3.getHourlyRate();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        boolean boolean9 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("faculty", "faculty");
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "faculty");
        boolean boolean10 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "faculty");
        faculty3.login("hi!", "faculty");
        faculty3.login("", "faculty");
        java.lang.String str10 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        double double12 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("", "hi!");
        double double13 = faculty3.getHourlyRate();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getEmail();
        double double16 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("", "hi!");
        double double14 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        boolean boolean17 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.login("", "");
        faculty3.login("", "faculty");
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "hi!");
        faculty3.login("faculty", "faculty");
        java.lang.String str7 = faculty3.getID();
        faculty3.logout();
        boolean boolean9 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        boolean boolean13 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.login("faculty", "hi!");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }
}

